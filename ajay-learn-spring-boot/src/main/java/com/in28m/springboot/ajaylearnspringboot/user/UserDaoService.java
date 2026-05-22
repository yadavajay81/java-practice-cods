package com.in28m.springboot.ajaylearnspringboot.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;



@Component
public class UserDaoService { 
	
	// JPA/Hibernate > Database
	// UserDaoService > Static List
	
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount, "Ajay", LocalDate.now().minusYears(42)));
		users.add(new User(++usersCount, "Mamta", LocalDate.now().minusYears(34)));
		users.add(new User(++usersCount, "Srishti", LocalDate.now().minusYears(13)));
		users.add(new User(++usersCount, "Shreya", LocalDate.now().minusYears(10)));
		users.add(new User(++usersCount, "Shreyas", LocalDate.now().minusYears(4)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		//return users.stream().filter(predicate).findFirst().get();
		//return somthing if not found
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
		
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

}
