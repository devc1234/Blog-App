package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payloads.UserDto;
import com.example.demo.servise.UserServises;

@RestController
@RequestMapping("/users/")
public class UserController {
	
	
	@Autowired
	private UserServises userServises;
	
	
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto createUserDto = this.userServises.createUser(userDto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
		return ResponseEntity.ok(this.userServises.getUserById(userId));
		
	}
	
	@PutMapping("/{userId}")
	  ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("UserId") Integer userId){
	UserDto updatUser = this.userServises.updateUser(userDto, userId);
	return ResponseEntity.ok(updatUser);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<? >deleteUser(@PathVariable("userId") Integer userId){
		return this.deleteUser(userId);
	}
}
