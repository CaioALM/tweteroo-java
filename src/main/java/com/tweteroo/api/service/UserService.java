package com.tweteroo.api.service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.tweteroo.api.repository.*;
import com.tweteroo.api.dto.*;
import com.tweteroo.api.model.*;
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void save(UserDTO req) {

        repository.save(new User(req));

    }
}
