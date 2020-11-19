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
import org.springframework.web.bind.annotation.PathVariable;

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

	public Long getByEmailandPassword(@PathVariable("email") String email, @PathVariable("password") String password){
		List<User> test = personRepo.findByEmailAndPassword(email, password);
		if(test.size() > 0) {
			return test.get(0).getId();
		}
		return new Long(-1);
	}

	public void deletePerson(Long id) {
		personRepo.deleteById(id);
	}

	public User getPersonById(@PathVariable("id") Long id) {
		List<Long> temp = new ArrayList<>();
		temp.add(id);
		List<User> res = new ArrayList<>();
		personRepo.findAllById(temp).forEach(res::add);
		//System.out.println(res.get(0));
		//return personRepo.findById(id);
		return res.get(0);
	}
	
	public List<User> getByFirstNameAndLastName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		List<User> users = new ArrayList<User>();
		personRepo.findByFirstNameAndLastName(firstName, lastName).forEach(users::add);
        return users;
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
