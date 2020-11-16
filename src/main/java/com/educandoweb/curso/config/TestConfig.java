package com.educandoweb.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null,"Flávio Costa","flavio.gordo@gmail.com","97747336","1234");
		User u2 = new User(null,"Diego Sousa","diego.sousa@gmail.com","923232423","1234");
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
