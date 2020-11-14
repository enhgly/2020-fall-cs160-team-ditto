package com.grouped.grouped.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface GroupCircleRepo extends CrudRepository<GroupCircle, Long>
{
    List<GroupCircle> findByGroupId(Long groupId);
}
