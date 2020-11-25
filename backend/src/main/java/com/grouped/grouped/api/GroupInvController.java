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

import com.grouped.grouped.model.GroupInv;
import com.grouped.grouped.service.GroupInvService;


@RequestMapping("/servers")
@RestController
public class GroupInvController {
	
	private final GroupInvService groupInvService;
	
	@Autowired
	public GroupInvController(GroupInvService groupInvService) {
		this.groupInvService = groupInvService; 
	}
	
	@PostMapping(value = "/post")
	public void addGroupInv(@Valid @RequestBody GroupInv groupInv) {
		groupInvService.addGroupInv(groupInv);
	}
	
	@GetMapping(value = "/get")
	public List<GroupInv> getAllGroupInv() { 
		return groupInvService.getAllGroupInv();
	}

	@PostMapping(value = "/get_id")
	public List<GroupInv> getByUserId(@RequestBody GroupInv groupInv) { 
		return groupInvService.getByUserId(groupInv.getUserId());
	}

}
