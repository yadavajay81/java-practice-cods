package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;


@Component
public class PacmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("PacManGame jump");
	}
	public void down() {
		System.out.println("PacManGame down");
	}
	
	public void left() {
		System.out.println("PacManGame left");
	}
	
	public void right() {
		System.out.println("PacManGame right");
	}
	
	

}
