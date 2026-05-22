package com.att.jfrogusertoken.jfrog_token_expiration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.att.jfrogusertoken.jfrog_token_expiration.entity.Token;
import com.att.jfrogusertoken.jfrog_token_expiration.service.TokenService;

@RestController
@RequestMapping("/api/v1")
public class TokenController {
	
	@Autowired
	private TokenService tokenService;
	
	//cmVmaW5lOjA6MTczNDIzNDMyOmdkZmdkZmdkZnJlcmVjeGZnZmdmZGdmZGdm
	//eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
	@GetMapping("/token/{token}")
	public String tokenExpirationDate(@PathVariable("token")
	String token) {
		
		return tokenService.tokenExpirationDate(token);
	}
	
	@PostMapping("/token")
	public String tokenExpDate(@RequestBody Token token) {
		
		return tokenService.tokenExpirationDate(token.getToken());
	}

}
