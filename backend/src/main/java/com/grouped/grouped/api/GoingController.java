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

import com.grouped.grouped.model.Going;
import com.grouped.grouped.model.GoingRepo;
import com.grouped.grouped.service.GoingService;

@RequestMapping("going")
@RestController
public class GoingController {
    private final GoingService goingService;
	
	@Autowired
	public GoingController(GoingService goingService) {
		this.goingService = goingService; 
	}
	
	@PostMapping(value = "/save")
	public void addGoing(@Valid @NonNull @RequestBody Going going) {
		goingService.addGoing(going);
	}
	
	@GetMapping(value="/fetch")
	public List<Going> getAllGoing() { 
		return goingService.getAllGoing();
    }
    
    @PostMapping(value="/retrieve_going")
	public List<Going> getByEventId(@RequestBody Going going ) { 
		return goingService.getByEventId(going.getEventId());
    }
}