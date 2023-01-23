package com.tweteroo.api.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.tweteroo.api.service.*;
import org.springframework.http.HttpStatus;

import jakarta.validation.Valid;
import com.tweteroo.api.dto.*;

@RestController
@RequestMapping("/sign-up")

public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createUser(@RequestBody @Valid UserDTO req) {
        service.save(req);
        System.out.println("OK");
    }
}
