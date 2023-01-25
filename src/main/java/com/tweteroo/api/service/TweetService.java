package com.tweteroo.api.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.tweteroo.api.model.*;
import org.springframework.data.domain.*;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.model.Tweet;
import com.tweteroo.api.repository.*;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;

    public void save( String username, TweetDTO req) {
        Optional<User> user = userRepository.findByUsername(username);

        if(user.isPresent()) {
            tweetRepository.save(new Tweet(req, username, user.get().getAvatar()));
        }

    }

    public Page<Tweet> getTweets(Pageable page) {
        return tweetRepository.findByIdDesc(page);
    }

    public List<Tweet> getTweetsByUser(String username) {
        Optional<User> user = userRepository.findByUsername(username);

        if(!user.isPresent()) return List.of();

        return tweetRepository.findByUsername(username);
    }
    
    
}
