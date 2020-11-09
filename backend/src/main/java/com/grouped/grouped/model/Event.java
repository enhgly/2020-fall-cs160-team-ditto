package com.grouped.grouped.model;

import java.lang.annotation.Inherited;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Event {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
    private String details; //date, location, details of event

   public void setDetails(String details) {
       this.details = details;
   }

   public String getDetails() {
        return details;
   }

   public Long getEventId() {
       return eventId;
   }

   public void setEventId(Long eventId) {
       this.eventId = eventId;
   }
}
