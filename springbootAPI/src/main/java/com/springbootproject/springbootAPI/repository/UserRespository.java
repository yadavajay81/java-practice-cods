package com.springbootproject.springbootAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootproject.springbootAPI.entity.User;

public interface UserRespository extends JpaRepository<User, Long> {

}
