package com.tweteroo.api.model;

import com.tweteroo.api.dto.TweetDTO;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {
    
    public Tweet(TweetDTO data) {
        this.username = data.username();
        this.tweet = data.tweet();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    Long id;

    @Column(length = 100, nullable = false)
    String username;

    @Column(length = 400, nullable = false)
    String tweet;
}
