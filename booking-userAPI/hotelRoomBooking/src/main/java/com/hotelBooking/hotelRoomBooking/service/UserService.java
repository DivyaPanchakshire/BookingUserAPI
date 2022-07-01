package com.hotelBooking.hotelRoomBooking.service;

import com.hotelBooking.hotelRoomBooking.entity.User;

import java.util.List;

public interface UserService {

  public User saveUser(User user);

public List<User> fetchUserList();

public User fetchUserById(Integer userId);

public void deleteUserById(Integer userId);

public User updateUser(Integer userId, User user);

}
