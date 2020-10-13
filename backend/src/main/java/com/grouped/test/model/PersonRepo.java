package com.grouped.test.model;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<User, Long>
{

}
