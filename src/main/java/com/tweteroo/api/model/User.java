package com.tweteroo.api.model;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.tweteroo.api.dto.UserDTO;

@Data
@Entity
@Table(name = "Users")
@NoArgsConstructor

public class User {

    public User(UserDTO data) {
        this.username = data.username();
        this.avatar = data.avatar();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String username;

    @Column(length = 1000, nullable = false)
    private String avatar;
}
