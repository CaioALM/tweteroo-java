package com.tweteroo.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.*;
import com.tweteroo.api.model.*;
import com.tweteroo.api.repository.*;
import com.tweteroo.api.dto.*;

@RestController
@RequestMapping("/sign-up")

public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public void createUser(@RequestBody UserDTO req) {

        repository.save(new User(req));
        System.out.println("User created successfully");
    }
}
