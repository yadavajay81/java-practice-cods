package com.in28m.springboot.ajaylearnspringboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28m.springboot.ajaylearnspringboot.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	

}
