package com.grouped.grouped.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface GoingRepo extends CrudRepository<Going, Long>
{
    List<Going> findByEventId(Long eventId);
}
