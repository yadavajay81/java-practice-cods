package com.att.jfrogusertoken.jfrog_token_expiration.service;

import java.util.Base64;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.stereotype.Service;

@Service
public class TokenService {
	
	public String tokenExpirationDate(String token) {
		
		if(token.contains(".")) {
			return token;
		}else {
			byte[] decodedBytes = Base64.getDecoder().decode(token);
			String decodedString = new String(decodedBytes);
			String[] decodedStringArr = decodedString.split(":");
			int timeStamp = Integer.parseInt(decodedStringArr[2]);
			
			LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.systemDefault());
		
			return "Token Expiration Date: "+dateTime;
		}
		
		
		
	}

}
