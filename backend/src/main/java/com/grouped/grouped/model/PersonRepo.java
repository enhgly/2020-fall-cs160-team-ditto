package com.grouped.grouped.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<User, Long>
{
	List<User> findByEmailAddressAndPassword(String emailAddress, String password);

}
