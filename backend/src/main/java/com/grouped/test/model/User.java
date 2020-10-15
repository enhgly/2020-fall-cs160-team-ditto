package com.grouped.test.model;

import java.lang.annotation.Inherited;

import java.util.UUID;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dateOfBirth;
    private String gender;
    private String phone;

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getEmail() {return email;}

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() { return dateOfBirth;}

    public String getGender() {return gender;    }

    public String getPhone() {return phone;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String s) {
        firstName = s;
    }

    public void setLastName(String s){ lastName = s; }

    public void setPassword(String p) { password = p; }

    public void setEmail(String s){email = s;}

    public void setDateOfBirth(String s){dateOfBirth = s;}

    public void setGender(String s){gender=s;}

    public void setPhone(String s){phone = s;}

    public String toString() {
        return firstName + ", " + lastName + ", " + email + ", " + password + ", " + dateOfBirth + ", " + gender + ", " + phone;
    }
}

/*
//login info
firstName: $('#fName').val(),
                    lastName: $('#lName').val(),
                    email: $('#email').val(),
                    password: $('#password').val(),
                    dateOfBirth: $('#DoB').val(),
                    gender: $('#gender').val(),
                    phone: $('#phone').val()
 */