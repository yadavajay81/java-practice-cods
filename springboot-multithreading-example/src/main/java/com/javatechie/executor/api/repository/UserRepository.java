package com.javatechie.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
