package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grouped.grouped.model.LoginInfo;
import com.grouped.grouped.model.LoginRepo;
import com.grouped.grouped.model.Person;

@Service
public class LoginService {

	@Autowired
	private LoginRepo loginRepo;
	
	
	public Long addLogin(LoginInfo login) {
		return loginRepo.save(login).getUserKey();
	}
	
	public Optional<LoginInfo> getLoginInfo(Long user_key) {
		return  loginRepo.findById(user_key);
	}
	

	public List<LoginInfo> getAllLogin(){
		List<LoginInfo> logins = new ArrayList<LoginInfo>();
		loginRepo.findAll().forEach(logins::add);
        return logins;
    }
/*
	public Optional<LoginInfo> updateLoginInfo(Long user_key, String newPassword) {
		Optional<LoginInfo> loginInfo = loginRepo.findById(user_key);
		LoginInfo newLoginInfo = (LoginInfo) loginInfo;
		
		loginInfo.setPassword(newPassword);
		loginRepo.saveAll(loginInfo);
		return  loginRepo.findById(user_key);
	}
	*/
	
	public void deleteLoginInfo(Long user_key) {
		loginRepo.deleteById(user_key);
	}


}
