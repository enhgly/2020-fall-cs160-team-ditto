package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grouped.grouped.model.Person;
import com.grouped.grouped.model.PersonRepo;


@Service
public class PersonService {
	

	@Autowired
	private PersonRepo personRepo;
	
	public Long addPerson(Person person) {
		return personRepo.save(person).getId();
	}
	

	public List<Person> getAllPeople(){
		List<Person> messages = new ArrayList<Person>();
		personRepo.findAll().forEach(messages::add);
        return messages;
    }

	
	// use save or delete methods
	// use find method to return a single person
/*
	public Optional<Person> getPersonById(UUID id){
		return personDao.selectPersonById(id);
	}
	
	public int deletePerson(UUID id) {
		return personDao.deletePersonById(id);
	}
	
	public int updatePerson(UUID id, Person newPerson) {
		return personDao.updatePersonById(id, newPerson);
	}
	*/
	
}
