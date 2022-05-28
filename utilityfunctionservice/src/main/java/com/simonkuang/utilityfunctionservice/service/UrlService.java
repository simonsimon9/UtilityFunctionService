package com.simonkuang.utilityfunctionservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simonkuang.utilityfunctionservice.models.Url;
import com.simonkuang.utilityfunctionservice.repo.UrlRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UrlService {
	
	
	private UrlRepo urlRepo;
	@Autowired
	public UrlService(UrlRepo urlRepo) {
		this.urlRepo = urlRepo;
	}
	
	public Url addUrl(Url url) {
		
		String originalurl = url.getOriginalurl();
		String hash = UUID.nameUUIDFromBytes(originalurl.getBytes()).toString().substring(0,7);
		url.setHashValue(hash);
		
		Url foundDataByHashValue = urlRepo.findUrlByHashValue(url.getHashValue());
		
		if(foundDataByHashValue == null) {
			log.info("New url entry saved and return tiny url");
			url.createAndSetTinyUrl(url.getHashValue());
			return urlRepo.save(url);
		}
			
		log.info("Url entry was NOT a new entry, return cached url");
		return foundDataByHashValue;
		
		
	}
	
	public String obtainUrl(String id) {
		Url foundDataByHashResult = urlRepo.findUrlByHashValue(id);
		if(foundDataByHashResult == null) {
			log.info("Cannot find url based on the hash");
			return "localhost:4200";
		}
		
		log.info("Hash found");
		return foundDataByHashResult.getOriginalurl();
		
		
	}
}
