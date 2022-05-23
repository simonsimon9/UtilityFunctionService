package com.simonkuang.utilityfunctionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simonkuang.utilityfunctionservice.repo.UrlRepo;


@Service
public class UrlService {
	
	
	private UrlRepo urlRepo;
	@Autowired
	public UrlService(UrlRepo urlRepo) {
		this.urlRepo = urlRepo;
	}
	
}
