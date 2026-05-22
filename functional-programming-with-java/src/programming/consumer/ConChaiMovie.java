package programming.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConChaiMovie {

	
	String name;
	String result;
	
	
	


	public ConChaiMovie(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}





	public static void main(String[] args) {
		ArrayList<ConChaiMovie> m = new ArrayList<ConChaiMovie>();
		populate(m);
		
		Consumer<ConChaiMovie> c1 = s->System.out.println("Movie "+s.name+" ready to release!");
		Consumer<ConChaiMovie> c2 = s->System.out.println("Movie "+s.name+" just released it is a "+s.result);
		Consumer<ConChaiMovie> c3 = s->System.out.println("Movie "+s.name+" information storing in database");
		
		Consumer<ConChaiMovie> cc = ccm->c1.andThen(c2).andThen(c3).accept(ccm);
		
		for(ConChaiMovie cm:m) {
			cc.accept(cm);
			System.out.println("=====================");
		}


	}





	private static void populate(ArrayList<ConChaiMovie> m) {
		m.add(new ConChaiMovie("Bahubali", "Super Hit"));
		m.add(new ConChaiMovie("Tahubali", "Flop"));
		m.add(new ConChaiMovie("Kahubali", "Hit"));
		m.add(new ConChaiMovie("Nahubali", "Super Flop"));
		m.add(new ConChaiMovie("Mahubali", "Hit"));
		
	}

}
