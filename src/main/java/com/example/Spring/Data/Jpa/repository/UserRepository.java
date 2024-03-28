package com.example.Spring.Data.Jpa.repository;

import com.example.Spring.Data.Jpa.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

//    UserEntity findByUsernameAndEmail(String username,String email); // and
//    List<UserEntity> findByUsernameOrEmail(String username,String email); //Or
//
//    List<UserEntity> findByAgeEquals(int age);// Equals
//
//    List<UserEntity> findByAgeBetween(int minage, int maxage); //Between
//
//    List<UserEntity>findByAgeIsNotNull(); //IsNotNull
//
//    List<UserEntity>findByUsernameStartingWith(String username); //StartingWith
//
//    List<UserEntity> findByUsernameStartingWithOrderByAgeDesc(String prefix);



    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
    List<UserEntity> findByUserna(String username);

    @Query("select u from UserEntity u where u.username LIKE '%a%' ")
    List<UserEntity> find6Character();

    @Query("select u from UserEntity u where u.age = ?1")
    List<UserEntity> findByAge(int age);


    
}
