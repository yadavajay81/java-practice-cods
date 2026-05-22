package java8certification;

import java.util.stream.Collectors;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AnagramCheck {
    public static void main(String[] args) {
    	
    	
    	
    	String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);
    	
    	
    	 LocalTime time = LocalTime.of(16, 40);
         String amPm = time.getHour() >= 12 ? "PM" : "AM";
         System.out.println(amPm); 
    	
        String s1 = "secure";
        String s2 = "rescue";

         boolean isAnagram = s1.length() == s2.length() && 
                s1.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .equals(s2.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        if (isAnagram) {
            System.out.println("Two strings are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
        
        
        boolean isAnagram1 = false;
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        if(str1.length() != str2.length()){
        	isAnagram1 = false;
        }
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        
        
        isAnagram1 = Arrays.equals(str1Arr, str2Arr);
        
        if (isAnagram1) {
            System.out.println(s1+" and "+s2+" are anagrams.");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
        
        
    }
}

