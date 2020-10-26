package com.grouped.grouped.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class LoginInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_key;
	private String password;
	private String email;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	public Long getUserKey() {
		return user_key;
	}
	
	public void setUserKey(Long user_key) {
		this.user_key = user_key;
	} 

}
