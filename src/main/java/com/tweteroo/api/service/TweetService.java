package com.tweteroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.model.Tweet;

import com.tweteroo.api.repository.*;

import jakarta.validation.Valid;

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;

    public List <Tweet> listAll() {
        return repository.findAll();
    }

    public void save(@RequestBody @Valid TweetDTO req) {
        repository.save(new Tweet(req));

        System.out.println("OK");
    }
    
    
}
