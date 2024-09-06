package com.feg.securityservice.service;

import com.feg.securityservice.userRepository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository user;

    public UserService(UserRepository user) {
        this.user = user;
    }

    
}
