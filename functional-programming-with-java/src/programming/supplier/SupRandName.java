package programming.supplier;

import java.util.function.Supplier;

/**
 * return random name from given name
 * @author yadav
 *
 */
public class SupRandName {

	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String[] name = {"Sunny","Munny","Vunny","Tunny"};
			int x = (int) (Math.random()*4);//random from 0 to 3
			return name[x];
		};

System.out.println("Random Name: "+s.get());

	}

}
