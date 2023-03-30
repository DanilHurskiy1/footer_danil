package com.example.spring_dz.repository;

import com.example.spring_dz.repository.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}