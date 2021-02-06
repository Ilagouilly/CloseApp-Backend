package com.ismaillagouilly.closeapp.controller;

import com.ismaillagouilly.closeapp.data.model.User;
import com.ismaillagouilly.closeapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CloseAppRestController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public static String helloWorld() {
        return UserService.helloWorld();
    }

    @GetMapping("/users")
    public String getAllUsers() {
        return this.userService.getAllUsers();
    }
    @GetMapping("/user/{firstname}")
    public String getUser(@PathVariable("firstname") String firstname) {
        User user = this.userService.getUser(firstname);
        if (user != null) return user.toString();
        else return "No user was found!";
    }
}
