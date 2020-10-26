package com.grouped.grouped.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grouped.grouped.model.GroupCircle;
import com.grouped.grouped.service.GroupCircleService;


@RequestMapping("/grouped")
@RestController
public class GroupCircleController {
	
	private final GroupCircleService groupService;
	
	@Autowired
	public GroupCircleController(GroupCircleService groupService) {
		this.groupService = groupService; 
	}
	
	@PostMapping(value = "/group")
	public void addGroup(@Valid @RequestBody GroupCircle group) {
		groupService.addGroup(group);
	}
	
	@GetMapping(value = "/group")
	public List<GroupCircle> getAllGroups() { 
		return groupService.getAllGroups();
	}
	
	@DeleteMapping(path = "/group/{id}")
	public void deleteGroupById(@PathVariable("id") Long id) {
		groupService.deleteGroup(id);
	}

}
