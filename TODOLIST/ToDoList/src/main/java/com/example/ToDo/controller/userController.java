package com.example.ToDo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ToDo.entity.User;
import com.example.ToDo.service.UserService;


@RestController
public class userController {

	@Autowired
	UserService userService;
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping("/postUser")
	public String  postUser(@RequestBody User user) {
		return userService.postUser(user);
	}
	
	@GetMapping("/getUser")
	public Optional<User>  getUser(@RequestParam String userName,@RequestParam String password) {
		return userService.getUser(userName, password);
	}

}
