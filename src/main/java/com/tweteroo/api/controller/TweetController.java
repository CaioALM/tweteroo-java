package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tweteroo.api.model.Tweet;

import java.util.*;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetRepository repository;

    @GetMapping
    public List <Tweet> listAll() {
        return repository.findAll();
    }
    
}
