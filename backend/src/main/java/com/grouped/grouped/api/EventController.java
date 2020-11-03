package com.grouped.grouped.api;

import java.util.List;

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

import com.grouped.grouped.model.Event;
import com.grouped.grouped.service.EventService;


@RequestMapping("/partytime")
@RestController
public class EventController {
	
	private final EventService eventService;
	
	@Autowired
	public EventController(EventService eventService) {
		this.eventService = eventService; 
	}
	
	@PostMapping(value = "/event")
	public void addEvent(@Valid @NonNull @RequestBody Event event) {
		eventService.addEvent(event);
	}
	
	@GetMapping(value = "/event_fetch")
	public List<Event> getAllEvent() { 
		return eventService.getAllEvent();
	}
	
	@DeleteMapping(path = "/channel/{id}")
	public void deleteEventById(@PathVariable("id") Long id) {
		eventService.deleteEvent(id);
	}

}
