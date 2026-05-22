package java8certification;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingCharacters {
    public static void main(String[] args) {
        String input = "Wednesday";

        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c) 
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) 
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
