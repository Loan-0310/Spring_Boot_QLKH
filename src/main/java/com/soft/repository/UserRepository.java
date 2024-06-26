package com.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.models.User;


public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
