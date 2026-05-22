package java8certification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListItrator {

	public static void main(String[] args) {
		
		
		System.out.println("//=========Array and List===============//");
		int[] array = new int[10];
		
		System.out.println(Arrays.toString(array));
		
		String[] strArray = new String[5];
		System.out.println(Arrays.toString(strArray));
		
		
		System.out.println("//========================//");
		
		
		List<String> lists = new ArrayList<>();
		lists.add("Mango");
		lists.add("Banana");
		lists.add("Pomigraned");
		lists.add("Applle");
		lists.add("Guava");
		lists.add("Orange");
		lists.add("Grapes");
		
		lists.remove("Applle");
		lists.remove(2);
		System.out.println("Print with stream");
		
		lists.stream().forEach(System.out::println);
		System.out.println("sorting with stream");
		lists.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
		System.out.println("Print with stream END");
		
		
		
		Iterator<String> itrator = lists.iterator();
		
		while(itrator.hasNext()) {
			System.out.println(itrator.next());
		}
		
		System.out.println("=====Afetr sorting====");
		Collections.sort(lists);
		for(String list: lists) {
			System.out.println(list);
		}
		
		//custom comparator
		System.out.println("=====Afetr comparator====");
		lists.sort((a, b)-> b.compareTo(a));
		for(String list: lists) {
			System.out.println(list);
		}
		

	}

}
