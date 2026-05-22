package programming.testinterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
		
		List<String> fruitList = Arrays.asList("Apple", "Mango", "Banana", "Apple", "Orange");
		
		fruitList.forEach(f->System.out.println(f));
		System.out.println("======================================");
		
		fruitList.forEach(f->System.out.println(f.length()));
		System.out.println("======================================");
		
		List<String> newFruitList = fruitList.stream().filter(f->f.length()<6)
				.collect(Collectors.toList());
		
		newFruitList.forEach(f->System.out.println(f));
		System.out.println("======================================");
		
		fruitList.stream().filter(f->f.length()>5).forEach(s->System.out.println(s));
		System.out.println("======================================");
		
		fruitList.stream().filter(f->f.startsWith("O")).forEach(s->System.out.println(s));
		System.out.println("======================================");
		
		System.out.println("===Map===convert one data type to another data type=====");
		
		fruitList.stream().map(String::length).forEach(f->System.out.println(f));
		
		System.out.println("=================flatMap=========");
		
		List<Integer> in1 = Arrays.asList(2,3,4,5);
		List<Integer> in2 = Arrays.asList(20,30,40,50);
		List<Integer> in3 = Arrays.asList(12,13,14,15);
		
		List<List<Integer>> listOfList= Arrays.asList(in1,in2,in3);
		System.out.println(listOfList);
		
		List<Integer> intList = listOfList.stream()
				.flatMap(i->i.stream()).collect(Collectors.toList());
		System.out.println(intList);
		
		System.out.println("=====use sorting====");
		List<Integer> int3 = Arrays.asList(0,99,12,300,13,100,14,15);
		
		int3.stream().sorted().forEach(s->System.out.println(s));
		
		System.out.println("=====use custom sorting====");
		List<String> str1 = Arrays.asList("aaaaaa","aa","aaaaa","kjhi");
		
		
		str1.stream().sorted(Comparator.comparing(String::length)).forEach(s->System.out.println(s));
		
		

	}

}
