package com.grouped.grouped.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<User, Long>
{
	List<User> findByEmailAndPassword(String email, String password);

	List<User> findByFirstNameAndLastName(String firstName, String lastName);
}
