package programming.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByStream {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(19);
		al.add(16);
		al.add(18);
		al.add(105);
		al.add(154);
		al.add(155);
		
		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		
		List<Integer> ld = al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(ld);
		
		List<Integer> oddNumber = al.stream().filter(i->i%2==1).map(s->s*3).collect(Collectors.toList());
		
		System.out.println("Odd Number: "+oddNumber);
		
		
		
		
		
		
		

	}

}
