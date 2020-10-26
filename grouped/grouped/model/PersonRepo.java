package com.grouped.grouped.model;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<User, Long>
{

}
