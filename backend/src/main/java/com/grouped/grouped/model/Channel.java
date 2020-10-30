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
	private Long channel_id;
	@NotBlank
	private String name;
	private Long group_id;
	private String type;
	

	public void setChannelId(Long id) {
		this.channel_id = id;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public Long getChannelId() {
		return channel_id;
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

	public Long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
	}


}
