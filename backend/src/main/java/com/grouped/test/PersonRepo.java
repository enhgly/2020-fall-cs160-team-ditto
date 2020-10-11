package com.grouped.test;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<User, Long>
{

}
