package com.hotelBooking.hotelRoomBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelBooking.hotelRoomBooking.entity.User;
import com.hotelBooking.hotelRoomBooking.service.UserService;
import com.hotelBooking.hotelRoomBooking.service.UserServiceImplementation;



@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
    public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	
   }
	
	@GetMapping("/users")
	public List<User> fetchUserList(){
		return userService.fetchUserList();
		}
	
	@GetMapping("/users/{id}")
	public User fetchUserById(@PathVariable("id")Integer userId) {
		return userService.fetchUserById(userId);
		}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id") Integer userId) {
		userService.deleteUserById(userId);
		return "user deleted successfully";
		}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable("id") Integer userId, @RequestBody User user) {
		return userService.updateUser(userId, user);
	}
		
		
	
	
	
}
