package com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TweetDTO(
    
    @NotBlank
    @NotNull
    String username,

    @NotNull
    String avatar,

    @NotBlank
    @NotNull
    String tweet) {

}
