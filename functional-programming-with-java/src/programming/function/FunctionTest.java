package programming.function;

import java.util.function.Function;

public class FunctionTest {
	
	public static void main(String[] args) {
		Function<String, Integer> f = s->s.length();
		
		System.out.println(f.apply("Ajay"));
		
		Function<Integer, Integer> num = i->i*i;
		
		System.out.println(num.apply(4));
		
		System.out.println(num.apply(f.apply("Ajay Bahadur")));
	}

}
