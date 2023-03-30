package com.example.spring_dz;

import com.example.spring_dz.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
@AllArgsConstructor
public class MyRunner implements CommandLineRunner {

    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello from my line runner");
    }
}
