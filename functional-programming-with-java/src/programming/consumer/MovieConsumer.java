package programming.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Consume movie details and print 
 * all movie information
 * using consumer
 * @author yadav
 *
 */
public class MovieConsumer {
	
	String name;
	String hero;
	String heroin;
	
	MovieConsumer(String name,String hero,String heroin){
		this.name = name;
		this.hero = hero;
		this.heroin = heroin;
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<MovieConsumer> m = new ArrayList<MovieConsumer>();
		populate(m);
		Consumer<MovieConsumer> c = s->{
			System.out.println("Movie Name: "+s.name);
			System.out.println("Movie Hero: "+s.hero);
			System.out.println("Movie Heroin: "+s.heroin);
		};
		
		for(MovieConsumer d:m) {
			c.accept(d);
			System.out.println("----------------------------------------------");
			
		}
		
	}


	private static void populate(ArrayList<MovieConsumer> m) {
		m.add(new MovieConsumer("Bahubali","Parbhash","Anuska"));
		m.add(new MovieConsumer("Gadder","Sunny","Amisha"));
		m.add(new MovieConsumer("Pahatan","Salman","Katreena"));
		m.add(new MovieConsumer("Kuli","Amitabh","Rekha"));
		m.add(new MovieConsumer("Ladla","Jaiki","Susmita"));
		
	}

}
