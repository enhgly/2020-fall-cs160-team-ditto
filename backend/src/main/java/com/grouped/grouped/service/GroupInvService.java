package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.grouped.grouped.model.GroupInv;
import com.grouped.grouped.model.GroupInvRepo;

@Service
public class GroupInvService {
	

	@Autowired
	private GroupInvRepo groupInvRepo;
	
	public Long addGroupInv(GroupInv groupInv) {
		return groupInvRepo.save(groupInv).getId();
	}
	

	public List<GroupInv> getAllGroupInv(){
		List<GroupInv> g = new ArrayList<GroupInv>();
		groupInvRepo.findAll().forEach(g::add);
        return g;
	}
	
	public List<GroupInv> getByUserId(@PathVariable("userId") Long userId){
		List<GroupInv> g = new ArrayList<GroupInv>();
		groupInvRepo.findByUserId(userId).forEach(g::add);
        return g;
    }

	public void deleteGroupInv(Long id) {
		groupInvRepo.deleteById(id);
	}


	
}
