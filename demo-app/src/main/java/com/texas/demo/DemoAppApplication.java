package com.texas.demo;

import com.texas.demo.enums.Role;
import com.texas.demo.model.Student;
import com.texas.demo.model.User;
import com.texas.demo.repo.StudentRepo;
import com.texas.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoAppApplication
		implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

	@Autowired
	public UserRepo userRepo;

	@Autowired
	public PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		userRepo.save(
				new User("user",passwordEncoder.encode("user"), Role.STUDENT)
		);
	}
}
