package com.springbootproject.springbootAPI.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootproject.springbootAPI.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CustomRepository {
	
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void customQuery(Long id) {
		User user = entityManager.find(User.class, id);
		user.setEmail("newEmail@ttt.com");
		entityManager.flush(); // Force update immediately
		
	}

}
