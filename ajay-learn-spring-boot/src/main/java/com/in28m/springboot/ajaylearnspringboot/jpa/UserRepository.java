package com.in28m.springboot.ajaylearnspringboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28m.springboot.ajaylearnspringboot.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

}
