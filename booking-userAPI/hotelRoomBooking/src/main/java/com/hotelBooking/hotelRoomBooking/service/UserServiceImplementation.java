package com.hotelBooking.hotelRoomBooking.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelBooking.hotelRoomBooking.entity.User;
import com.hotelBooking.hotelRoomBooking.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
		
	}

	@Override
	public List<User> fetchUserList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User fetchUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).get();
	}

	@Override
	public void deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

	@Override
	public User updateUser(Integer userId, User user) {
		// TODO Auto-generated method stub
		User userDB = userRepository.findById(userId).get();
		
		if(Objects.nonNull(user.getUserName()) && 
		 !"".equalsIgnoreCase(user.getUserName())) {
			userDB.setUserName(user.getUserName());
		}
		
		if(Objects.nonNull(user.getUserEmail()) && 
				 !"".equalsIgnoreCase(user.getUserEmail())) {
					userDB.setUserEmail(user.getUserEmail());
    	}
		
		if(Objects.nonNull(user.getPassword()) && 
				 !"".equalsIgnoreCase(user.getPassword())) {
					userDB.setPassword(user.getPassword());
		}
		
		if(Objects.nonNull(user.getPhoneNumber()) && 
				 !"".equalsIgnoreCase(user.getPhoneNumber())) {
					userDB.setPhoneNumber(user.getPhoneNumber());
		}
		
		if(Objects.nonNull(user.getAddress()) && 
				 !"".equalsIgnoreCase(user.getAddress())) {
					userDB.setAddress(user.getAddress());
				}
		return userRepository.save(userDB);
		
	}
	
}
