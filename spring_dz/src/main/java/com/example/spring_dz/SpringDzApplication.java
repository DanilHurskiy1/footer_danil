package com.example.spring_dz;

import com.example.spring_dz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDzApplication.class, args);
	}

	@Bean
	MyRunner createMyRunner(UserRepository userRepository){
		return new MyRunner(userRepository);
	}

//		User user1 =  new User("Danil", "Hurskyi", "danilahurskiy@gmail.com");
//		userRepository.save(user1);
//
//		User user2 = new User("Valera", "Petrenko", "valerchuk@gmail.com");
//		userRepository.save(user2);
//
//		User user3 = new User("Gala", "Shevchenko", "sheva_ne_taras@gmail.com");
//		userRepository.save(user3);

}
