package com.ismaillagouilly.closeapp.service;

import com.ismaillagouilly.closeapp.data.model.User;
import com.ismaillagouilly.closeapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public static String helloWorld() {
        return "Hello World!";
    }

    public String getAllUsers() {
        return this.repository.findAll().toString();
    }

    public User getUser(String firstname) {
        return this.repository.findByFirstName(firstname);
    }
}
