package java8certification;

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String input = "Java is a programming language and Java is widely used in the software industry.";

        String result = Arrays.stream(input.split("\\s+")) 
                .collect(Collectors.toCollection(LinkedHashSet::new)) 
                .stream()
                .collect(Collectors.joining(" ")); 

        System.out.println("Output: " + result);
    }
}

