package com.simonkuang.utilityfunctionservice.service;

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
		
		url.setHashValue(url.getOriginalurl().hashCode());
		Url foundDataByHashValue = urlRepo.findUrlByHashValue(url.getHashValue());
		
		if(foundDataByHashValue == null) {
			log.info("New url entry saved and return tiny url");
			url.createAndSetTinyUrl(url.getHashValue());
			return urlRepo.save(url);
		}
			
		log.info("Url entry was not new entry, return saved url");
		return foundDataByHashValue;
		
		
	}
	
	public String obtainUrl(Long hashValue) {
		Url foundDataByHashResult = urlRepo.findUrlByHashValue(hashValue);
		if(foundDataByHashResult == null) {
			log.info("Cannot find url based on the hash");
			return "localhost:4200";
		}
		
		log.info("Hash found");
		return foundDataByHashResult.getOriginalurl();
		
		
	}
}
