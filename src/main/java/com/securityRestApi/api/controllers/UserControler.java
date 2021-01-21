package com.securityRestApi.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securityRestApi.api.models.User;
import com.securityRestApi.api.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserControler {
	
	@Autowired
	private UserRepository repository;

	public UserControler() {
		
	}

	@Bean 
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
	    return new BCryptPasswordEncoder(); 
	}
	
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		user.setPassword(bCryptPasswordEncoder().encode(user.getPassword()));
		return new ResponseEntity(repository.save(user), HttpStatus.OK);
	}
}
