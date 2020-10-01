package com.grouped.grouped.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String name;

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	} 
	
}
