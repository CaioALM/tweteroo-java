package com.tweteroo.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.model.Tweet;
import com.tweteroo.api.service.TweetService;

import jakarta.validation.Valid;

import com.tweteroo.api.service.*;
import java.util.*;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService service;

    @GetMapping
    public List <Tweet> listAll() {
        return service.listAll();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createTweet(@RequestBody @Valid TweetDTO req) {
        service.save(req);
        
        System.out.println("OK");
    }
    
    
}
