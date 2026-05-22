package java8certification;

import java.util.*;

public class SortByLength {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        languages.stream()
                .sorted(Comparator.comparingInt(String::length)) 
                .forEach(System.out::println); 
    }
}

