package java17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class JavaseventeenImp {

	public static void main(String[] args) {
		
		String longText = """
	            This is a text block in Java 17.
	            It allows you to write multi-line strings
	            without needing to escape newline characters.
	            
	            You can also preserve leading whitespace for formatting.
	            \tIndented text is also preserved.
	            """;

	        System.out.println(longText);
		
		ArrayList<Javaseventeen> js = new ArrayList<>();
		js.add(new Javaseventeen("Ajay","Hr",200));
		js.add(new Javaseventeen("Ajay1","Hr1",200));
		js.add(new Javaseventeen("Ajay2","Hr2",200));
		js.add(new Javaseventeen("Ajay3","Hr3",200));
		js.add(new Javaseventeen("Ajay4","Hr4",200));
		js.add(new Javaseventeen("Ajay5","Hr",2000));
		js.add(new Javaseventeen("Ajay5","Hr1",500));
		js.add(new Javaseventeen("Ajay5","Hr",1000));
		
		List<Javaseventeen> sal200 = js.stream().filter(j-> j.sal()==200)
				.collect(Collectors.toList());
		
		System.out.println(sal200);
		
		System.out.println(getDayOfWeek(3));

	}
	
	public static String getDayOfWeek(int day) {

        String dayOfWeek = switch (day) {

        case 1 -> "Monday";

        case 2 -> "Tuesday";

        case 3 -> "Wednesday";

        case 4 -> "Thursday";

        case 5 -> "Friday";

        default -> "Unknown";

    };

    return dayOfWeek;

}
	
	
	public static String weekDay(int daynum) {
		String dayName = switch(daynum) {
		case 1-> "Monday";
		case 2-> "Tuesday";
		case 3-> "Wednesday";
		case 4-> "Thursday";
		case 5-> "Friday";
		case 6-> "Saterday";
		case 7-> "Sunday";
		default -> "Unknown";
		
		};
		
		return dayName;
	}

}
