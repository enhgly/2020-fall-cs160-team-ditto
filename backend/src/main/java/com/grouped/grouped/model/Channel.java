package com.grouped.grouped.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Channel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long channelId;
	@NotBlank
	private String name;
	private Long groupId;
	private String type;
	

	public void setChannelId(Long id) {
		this.channelId = id;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public Long getChannelId() {
		return channelId;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}


}
