package com.manish.tinyurl.kgs.data.repository;

import com.manish.tinyurl.kgs.data.entity.KeyEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeyRepo extends PagingAndSortingRepository<KeyEntity, Long> {
    List<KeyEntity> findTopByStatus(String status);
}
