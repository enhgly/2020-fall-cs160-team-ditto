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
import com.grouped.grouped.model.User;


@Service
public class PersonService {
	

	@Autowired
	private PersonRepo personRepo;
	
	public Long addPerson(User person) {
		return personRepo.save(person).getId();
	}
	

	public List<User> getAllPeople(){
		List<User> users = new ArrayList<User>();
		personRepo.findAll().forEach(users::add);
        return users;
    }

	public Long getByEmailandPassword(String emailAddress, String password){
		//return personRepo.findByEmailAddressAndPassword(emailAddress, password).get(0).getId();
		return new Long(1);
	}
	public void deletePerson(Long id) {
		personRepo.deleteById(id);
	}
	
	// use save or delete methods
	// use find method to return a single person
	// look up JPA methods
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
