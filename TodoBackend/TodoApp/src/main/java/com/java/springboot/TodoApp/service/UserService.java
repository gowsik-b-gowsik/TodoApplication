package com.java.springboot.TodoApp.service;

import com.java.springboot.TodoApp.models.User;
import com.java.springboot.TodoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Bean
public class UserService {

    @Autowired      //Autowire used automatically create a object
    private UserRepository UserRepository;

    public User createUser(User User) {
        return UserRepository.save(User);
    }

    public User getUserById(Long id){
        return UserRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

}
