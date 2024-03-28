package com.example.Spring.Data.Jpa.repository;

import com.example.Spring.Data.Jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.data.domain.Sort;
@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity,Integer> {

    List<UserEntity> findAll(Sort sort);

}
