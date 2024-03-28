package com.example.Spring.Data.Jpa.service;

import com.example.Spring.Data.Jpa.entity.UserEntity;
import com.example.Spring.Data.Jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {


    @Autowired
    private UserRepository userRepository;


    public void Ascendingage(){
        Sort sort = Sort.by(Sort.Direction.ASC,"age");



        List<UserEntity> users = userRepository.findAll(sort);

        users.stream().forEach(System.out::println);
    }


    public void Decendingage(){
        Sort sort = Sort.by(Sort.Direction.DESC,"age");



        List<UserEntity> users = userRepository.findAll(sort);

        users.stream().forEach(System.out::println);
    }
}
