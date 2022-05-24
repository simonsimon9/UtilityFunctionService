package com.simonkuang.utilityfunctionservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Url {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long hashValue;
	private String originalurl;
	private String tinyurl;
	private int accesstimes;
	private Long userid; //foreign key.  created by
	
	public Url(String originalurl, String tinyurl) {
		this.id=null;
		this.hashValue= (long) -1;
		this.originalurl = originalurl;
		this.tinyurl = tinyurl;
		this.accesstimes = 0;
		this.userid = null;
	}
	/**
	 * @return the hashValue
	 */
	public Long getHashValue() {
		return hashValue;
	}
	/**
	 * @param i the hashValue to set
	 */
	public void setHashValue(int i) {
		this.hashValue = (long) i;
	}
	/**
	 * @return the originalurl
	 */
	public String getOriginalurl() {
		return originalurl;
	}
	/**
	 * @param originalurl the originalurl to set
	 */
	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}
	/**
	 * @return the tinyurl
	 */
	public String getTinyurl() {
		return tinyurl;
	}
	/**
	 * @param tinyurl the tinyurl to set
	 */
	public void setTinyurl(String tinyurl) {
		this.tinyurl = tinyurl;
	}
	/**
	 * @return the accesstimes
	 */
	public int getAccesstimes() {
		return accesstimes;
	}
	/**
	 * @param accesstimes the accesstimes to set
	 */
	public void setAccesstimes(int accesstimes) {
		this.accesstimes = accesstimes;
	}
	/**
	 * @return the createdBy
	 */
	public Long getCreatedBy() {
		return userid;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Long userid) {
		this.userid = userid;
	}
	
	public void createAndSetTinyUrl(Long hash) {
		this.setTinyurl("http://localhost:8080/tinyurl/" + String.valueOf(hash));
		
	}
}
