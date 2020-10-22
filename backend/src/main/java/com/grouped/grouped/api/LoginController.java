package com.grouped.grouped.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grouped.grouped.service.LoginService;
import com.grouped.grouped.service.PersonService;
import com.grouped.grouped.model.*;

@RequestMapping("api/user/login")
@RestController
public class LoginController {
	

	private LoginService loginService; 
	
	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService; 
	}
	
	@PostMapping
	public void addLoginInfo(@Valid @NonNull @RequestBody LoginInfo login) {
		loginService.addLogin(login);
		
		//Response response = new Response("done", login);
		//return response; 
	}
	
	@GetMapping
	public Response getLoginInfo(Long user_key) {
		Optional<LoginInfo> l = loginService.getLoginInfo(user_key);
		
		Response response = new Response("done", l);
		return response; 
	}
	
	@GetMapping(value = "/all")
	public List<LoginInfo> getAllPeople() { 
		return loginService.getAllLogin();
	}
	/*
	@GetMapping(path = "/{id}")
	public Response updateLogin(@PathVariable("id")Long user_key, String newPassword) {
		Optional<LoginInfo> l = loginService.updateLoginInfo(user_key, newPassword);
		
		Response response = new Response("done", l);
		return response; 
	}
	*/
	@DeleteMapping()
	public Response deleteLogin(Long user_key) {
		loginService.deleteLoginInfo(user_key);
		
		Response response = new Response("done", null);
		return response; 
	}
}
