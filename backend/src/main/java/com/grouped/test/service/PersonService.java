package com.grouped.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grouped.test.model.*;

@Service
public class PersonService {
	
	private PersonRepo personRepo;
	
	public Long addPerson(User person) {
		return personRepo.save(person).getId();
	}
	

	public List<User> getAllPeople(){
		List<User> messages = new ArrayList<User>();
		personRepo.findAll().forEach(messages::add);
        return messages;
    }	
}
