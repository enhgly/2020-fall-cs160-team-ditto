package com.grouped.grouped.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ChannelRepo extends CrudRepository<Channel, Long>
{
    List<Channel> findByGroupId(Long groupId);
}
