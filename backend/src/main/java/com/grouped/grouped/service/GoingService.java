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

import com.grouped.grouped.model.Going;
import com.grouped.grouped.model.GoingRepo;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class GoingService {
    @Autowired
    private GoingRepo goingRepo;

    public Long addGoing(Going going) {
		return goingRepo.save(going).getId();
	}
	
	public List<Going> getAllGoing(){
		List<Going> goings = new ArrayList<Going>();
		goingRepo.findAll().forEach(goings::add);
        return goings;
    }

    public List<Going> getByEventId(@PathVariable("eventId") Long eventId) {
		return goingRepo.findByEventId(eventId);
	}
}