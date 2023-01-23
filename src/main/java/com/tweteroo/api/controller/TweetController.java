package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.model.Tweet;
import com.tweteroo.api.repository.TweetRepository;

import jakarta.validation.Valid;

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
    @PostMapping
    public void createTweet(@RequestBody @Valid TweetDTO req) {
        repository.save(new Tweet(req));

        System.out.println("OK");
    }
    
    
}
