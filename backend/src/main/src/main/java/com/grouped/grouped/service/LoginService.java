package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grouped.grouped.model.LoginInfo;
import com.grouped.grouped.model.LoginRepo;
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

	
	public void deleteLoginInfo(Long user_key) {
		loginRepo.deleteById(user_key);
	}


}
