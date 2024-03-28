package com.example.Spring.Data.Jpa.repository;

import com.example.Spring.Data.Jpa.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Pagination extends PagingAndSortingRepository<UserEntity ,Integer> {


    Page<UserEntity> findByUsernameContaining(String username, Pageable pageable);
}
