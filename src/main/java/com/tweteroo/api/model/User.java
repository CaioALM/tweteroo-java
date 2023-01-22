package com.tweteroo.api.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;
import com.tweteroo.api.dto.*;

@Data
@Entity

public class User {

    public User(UserDTO data) {
        this.username = data.username();
        this.avatar = data.avatar();

    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String username;

    @Column(length = 500, nullable = false)
    private String avatar;
}
