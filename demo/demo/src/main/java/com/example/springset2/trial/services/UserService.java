package com.example.springset2.trial.services;

import com.example.springset2.trial.models.User;  // Import your custom User class
import com.example.springset2.trial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();
@Autowired
public UserRepository userRepository;
@Autowired
private PasswordEncoder passwordEncoder;


    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public User createUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);

    }
}

