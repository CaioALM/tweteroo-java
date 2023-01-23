package com.tweteroo.api.controller;

import org.springframework.web.bind.annotation.*;


import org.springframework.beans.factory.annotation.Autowired;
import com.tweteroo.api.model.*;
import com.tweteroo.api.repository.UserRepository;

import jakarta.validation.Valid;

import com.tweteroo.api.dto.*;

@RestController
@RequestMapping("/sign-up")

public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public void createUser(@RequestBody @Valid UserDTO req) {

        repository.save(new User(req));
        System.out.println("OK");
    }
}
