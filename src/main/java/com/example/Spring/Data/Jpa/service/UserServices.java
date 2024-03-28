package com.example.Spring.Data.Jpa.service;

import com.example.Spring.Data.Jpa.entity.UserEntity;
import com.example.Spring.Data.Jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class UserServices {


    @Autowired
    private UserRepository userRepository;



//    public UserEntity getByUsernameAndEmail(String  username,String email){
//        return userRepository.findByUsernameAndEmail(username,email);
//    }
//
//
//    public List<UserEntity> getByUsernameorEmail(String  username,String email){
//        return userRepository.findByUsernameOrEmail(username,email);
//    }
//
//    public List<UserEntity> getByAgeIsEnqual(Integer age){
//        return userRepository.findByAgeEquals(age);
//    }
//
//    public List<UserEntity> getBetweenAge(Integer minage,Integer maxage){
//        return userRepository.findByAgeBetween(minage,maxage);
//    }
//
//    public List<UserEntity> getByAgeNotNull(){
//        return userRepository.findByAgeIsNotNull();
//    }
//
//    public List<UserEntity> getUsernameStartingWith(String username){
//        return userRepository.findByUsernameStartingWith(username);
//    }
//
//    public List<UserEntity> findByAgeOrderByDesc(){
//        return userRepository.findByUsernameStartingWithOrderByAgeDesc("p");
//    }

    public List<UserEntity> findByAgeOrderByDesc(){
        return userRepository.find6Character();
    }

    public List<UserEntity> findByAge(int age){
        return userRepository.findByAge(age);
    }


}
