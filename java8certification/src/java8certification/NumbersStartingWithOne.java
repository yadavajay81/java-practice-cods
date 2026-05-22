package java8certification;

import java.util.Arrays;
import java.util.List;

public class NumbersStartingWithOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        numbers.stream()
                .map(String::valueOf) 
                .filter(num -> num.startsWith("1")) 
                .forEach(System.out::println); 
    }
}

