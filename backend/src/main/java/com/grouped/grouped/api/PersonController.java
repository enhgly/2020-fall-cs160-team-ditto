package com.grouped.grouped.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grouped.grouped.model.Person;
import com.grouped.grouped.model.User;
import com.grouped.grouped.service.PersonService;


	// api/v1/person is the path from the Postman 
@RequestMapping("api/user")
@RestController
public class PersonController {
	
	private final PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService; 
	}
	
	@PostMapping(value = "/save")
	public void addPerson(@Valid @NonNull @RequestBody User person) {
		personService.addPerson(person);
	}
	
	@GetMapping(value="/fetch")
	public List<User> getAllPeople() { 
		return personService.getAllPeople();
	}
	
	@PostMapping(value = "/signin")
	public Long getUserIdFromLogin(@RequestBody User person) {
		return personService.getByEmailandPassword(person.getEmail(), person.getPassword());
	}
	
	@DeleteMapping(path = "{id}")
	public void deletePersonById(@PathVariable("id") Long id) {
		personService.deletePerson(id);
	}

	@PostMapping(value = "/user")
	public User getPersonById(@RequestBody User person) {
		return personService.getPersonById(person.getId());
	}
	@PostMapping(path = "/verifyemail")
	public Boolean isEmailTaken(@RequestBody User email){
		List<User> userList = getAllPeople();
		for (int i = 0; i < userList.size(); i++){
			if(userList.get(i).getEmail().equals(email.getEmail())){
				return false;
			}
		}
		return true;
	}
	/*
	@GetMapping(path = "/{id}")
	public Person getPersonById(@PathVariable("id")UUID id) {
		return personService.getPersonById(id)
				.orElse(null);
	}
	
	@DeleteMapping(path = "{id}")
	public void deletePersonById(@PathVariable("id") UUID id) {
		personService.deletePerson(id);
	}
	
	@PutMapping(path = "{id}")
	public void updatePerson(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Person personToUpdate) {
		personService.updatePerson(id, personToUpdate);
	}
*/
}
