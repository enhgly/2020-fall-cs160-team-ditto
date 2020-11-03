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

import com.grouped.grouped.model.Event;
import com.grouped.grouped.model.EventRepo;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EventService {
	

	@Autowired
	private EventRepo eventRepo;
	
	public Long addEvent(Event event) {
		return eventRepo.save(event).getId();
	}
	
	public List<Event> getAllEvent(){
		List<Event> event = new ArrayList<Event>();
		eventRepo.findAll().forEach(event::add);
        return event;
    }

	public void deleteEvent(Long id) {
		eventRepo.deleteById(id);
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
