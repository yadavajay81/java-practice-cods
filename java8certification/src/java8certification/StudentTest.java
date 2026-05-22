package java8certification;

import java.time.LocalDate;
import java.time.LocalTime;

class Student {
    String name;
    int age;
    
    
    

    void Student() {
    	System.out.println("call-1");
        Student("James", 25);
    }

    void Student(String name, int age) {
    	System.out.println("call-2");
        this.name = name;
        this.age = age;
    }
}

public class StudentTest {
    public static void main(String[] args) {
    	
    	 LocalDate date = LocalDate.parse("1947-08-14");
         LocalTime time = LocalTime.MAX;
         System.out.println(date.atTime(time));
    	
    	
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
