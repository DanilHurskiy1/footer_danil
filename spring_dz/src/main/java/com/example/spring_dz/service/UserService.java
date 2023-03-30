package com.example.spring_dz.service;

import com.example.spring_dz.repository.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User saveUser(User user);
}
