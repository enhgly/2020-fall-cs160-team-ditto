package com.grouped.grouped.api;

import java.security.acl.Group;
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


@RequestMapping("/gc")
@RestController
public class GroupCircleController {
	
	private final GroupCircleService groupService;
	
	@Autowired
	public GroupCircleController(GroupCircleService groupService) {
		this.groupService = groupService; 
	}
	
	@PostMapping(value = "/post")
	public Long addGroup(@Valid @RequestBody GroupCircle group) {
		return groupService.addGroup(group);
	}
	
	@GetMapping(value = "/get")
	public List<GroupCircle> getAllGroups() { 
		return groupService.getAllGroups();
	}

	@PostMapping(value = "/get_id")
	public List<GroupCircle> getByGroupId(@RequestBody GroupCircle group) { 
		return groupService.getByGroupId(group.getGroupId());
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void deleteGroupById(@PathVariable("id") Long id) {
		groupService.deleteGroup(id);
	}

}
