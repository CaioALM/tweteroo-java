package com.tweteroo.api.model;

import com.tweteroo.api.dto.TweetDTO;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {
    
    public Tweet(TweetDTO data, String username, String avatar) {
        this.username = username;
        this.tweets = data.tweet();
        this.avatar = avatar;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    Long id;

    @Column(length = 100, nullable = false)
    String username;

    @Column(nullable = false)
    String avatar;

    @Column(length = 280, nullable = false)
    String tweets;
}
