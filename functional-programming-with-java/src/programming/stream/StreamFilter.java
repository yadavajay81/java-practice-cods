package programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filter odd number using stream
 * @author yadav
 *
 */
public class StreamFilter {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<>();
		i.add(97);
		i.add(23);
		i.add(15);
		i.add(22);
		i.add(33);
		i.add(76);
		i.add(34);
		i.add(72);
		
		System.out.println("============All Numbers=================");
		System.out.println(i);
		
		/**
		 * filter even from given array list
		 */
		List<Integer> even	= i.stream().filter(k->k%2==0).collect(Collectors.toList());
		System.out.println("============Even Numbers==============");
		System.out.println(even);
		
		/**
		 * get square of all numbers
		 * 
		 */
		
		List<Integer> ls = i.stream().map(j->j*j).collect(Collectors.toList());
		System.out.println("======================Square of All Numbers=======");
		System.out.println(ls);
		
		
		System.out.println("==================");
		int x=5;
		int k = ++x;
		int j = x++;
		System.out.println(k);
		System.out.println(j);

	}

}
