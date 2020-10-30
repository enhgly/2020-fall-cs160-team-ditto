package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grouped.grouped.model.GroupCircle;
import com.grouped.grouped.model.GroupCircleRepo;


@Service
public class GroupCircleService {
	

	@Autowired
	private GroupCircleRepo groupRepo;
	
	public Long addGroup(GroupCircle group) {
		return groupRepo.save(group).getGroupId();
	}
	

	public List<GroupCircle> getAllGroups(){
		List<GroupCircle> groups = new ArrayList<GroupCircle>();
		groupRepo.findAll().forEach(groups::add);
        return groups;
    }

	public void deleteGroup(Long id) {
		groupRepo.deleteById(id);
	}

	
}
