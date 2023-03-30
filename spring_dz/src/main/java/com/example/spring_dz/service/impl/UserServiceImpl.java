package com.example.spring_dz.service.impl;

import com.example.spring_dz.repository.models.User;
import com.example.spring_dz.repository.UserRepository;
import com.example.spring_dz.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
