package com.grouped.grouped.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface LoginRepo extends CrudRepository<LoginInfo, Long>{
	
	Optional<LoginInfo> findById(Long id);

}
