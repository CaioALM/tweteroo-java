package com.tweteroo.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.tweteroo.api.model.*;
import com.tweteroo.api.repository.UserRepository;
import com.tweteroo.api.dto.*;

@RestController
@RequestMapping("/sign-up")

public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List <User> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void createUser(@RequestBody UserDTO req) {

        repository.save(new User(req));
        System.out.println("User created successfully");
    }
}
