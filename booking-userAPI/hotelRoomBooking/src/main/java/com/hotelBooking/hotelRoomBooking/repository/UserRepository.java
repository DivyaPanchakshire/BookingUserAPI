package com.hotelBooking.hotelRoomBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelBooking.hotelRoomBooking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
