package com.tweteroo.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tweteroo.api.dto.*;

@RestController
@RequestMapping("/sign-up")

public class UserController {

    @PostMapping
    public void createUser(@RequestBody UserDTO req) {

        System.out.println(req.username());

    }
}
