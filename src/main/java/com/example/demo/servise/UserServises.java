package com.example.demo.servise;

import java.util.List;

import com.example.demo.payloads.UserDto;

public interface UserServises {
	
	  UserDto createUser(UserDto user);
	  UserDto updateUser(UserDto user,Integer userid);
	  UserDto getUserById(Integer userId);
	  List<UserDto> getAllUser();
	  void deleteUser(Integer userId);

}
