package com.simonkuang.utilityfunctionservice.models;

import lombok.Data;

@Data
public class TinyUrlResponse {
	String tinyurl;
	String originalurl;
	
	public TinyUrlResponse() {
		this.tinyurl = null;
		this.originalurl = null;
	}
	
	public TinyUrlResponse(String originialurl, String tinyurl) {
		this.originalurl = originialurl;
		this.tinyurl = tinyurl;
	}
	
	public TinyUrlResponse(Url obj) {
		this.originalurl = obj.getOriginalurl();
		this.tinyurl = obj.getTinyurl();
	}
	
	public void setTinyUrl(String tinyurl) {
		this.tinyurl = tinyurl;
	}
	public void setOriginalUrl(String originalurl) {
		this.originalurl = originalurl;
	}
	
	public String getTinyUrl() {
		return tinyurl;
	}
	public String getOriginalUrl() {
		return originalurl;
	}
}
