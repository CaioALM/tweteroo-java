package com.tweteroo.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.model.Tweet;
import com.tweteroo.api.service.TweetService;
import org.springframework.data.domain.*;
import jakarta.validation.Valid;
import java.util.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tweets")
public class TweetController { 

    @Autowired
    private TweetService service;

    @PostMapping
    public ResponseEntity<Void> createTweet(@RequestHeader("User") String username, 
    @RequestBody @Valid TweetDTO req) {

        service.save(username, req);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @GetMapping
    public Page<Tweet> getFiveTweets(@RequestParam String page) {

        int pageNumb = Integer.parseInt(page);

        Pageable sortedById = PageRequest.of(pageNumb, 5, Sort.by("id").descending());

        return service.getTweets(sortedById);
    }

    @GetMapping("/{username}")
    public List<Tweet> getTweetsByUsername(@PathVariable String username) {
        return service.getTweetsByUser(username);
    }

    
}
