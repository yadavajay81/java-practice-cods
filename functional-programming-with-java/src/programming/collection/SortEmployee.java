package programming.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {
	
	
	int eNumber;
	String eName;
	int ePin;
	int eSal;
	
	
	SortEmployee(int eNumber, String eName, int ePin, int eSal){
		this.eNumber =eNumber;
		this.eName =eName;
		this.ePin =ePin;
		this.eSal =eSal;
		
	}
	
	
	

	@Override
	public String toString() {
		return "SortEmployee [eNumber=" + eNumber + ", eName=" + eName + ", ePin=" + ePin + ", eSal=" + eSal + "]";
	}




	public static void main(String[] args) {
		ArrayList<SortEmployee> se = new ArrayList<SortEmployee>();
		se.add(new SortEmployee(10, "Shreyas", 63043, 1000));
		se.add(new SortEmployee(1, "Srishti", 63040, 9000));
		se.add(new SortEmployee(5, "Shreya", 63023, 100));
		se.add(new SortEmployee(3, "Shreyas1", 63035, 1800));
		se.add(new SortEmployee(6, "Shreyas3", 63011, 1020));
		
		//sort by pin assending order
		Collections.sort(se, (p1, p2)->(p1.ePin>p2.ePin)?1:(p1.ePin<p2.ePin)?-1:0);
			System.out.println(se);
			
			//sort by pin dessending order
			Collections.sort(se, (p1, p2)->(p1.ePin>p2.ePin)?-1:(p1.ePin<p2.ePin)?1:0);
			System.out.println(se);

	}

}
