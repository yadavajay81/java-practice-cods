package java8certification;

import java.util.*;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}

public class UserSorting {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Daniel", 40),
                new User("Bob", 20),
                new User("Asker", 10),
                new User("Cooper", 30),
                new User("Eric", 50)
        );

        users.sort((u1, u2) -> Integer.compare(u2.age, u1.age));

        users.forEach(System.out::println);
    }
}

