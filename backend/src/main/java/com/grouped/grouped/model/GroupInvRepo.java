package com.grouped.grouped.model;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface GroupInvRepo extends CrudRepository<GroupInv, Long>
{
    List<GroupInv> findByUserId(Long userId);
}
