package java8certification;

import java.util.stream.Collectors;

public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "JaAVaA GUIDES";
        char removeChar = 'a';

        String result = input.chars()
                .filter(ch -> ch != removeChar)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Output: " + result);
    }
}
