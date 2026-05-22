package programming.datetime;

import java.time.*;


public class DateTimeTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yyyy);
		
		LocalDateTime dt =  LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime dt1 =  LocalDateTime.of(2022,11,13,4,2);
		
		LocalDateTime dt2 =  LocalDateTime.of(2022,10,13,4,2);
		
		
		System.out.println(dt1+" - "+dt2);
		

	}

}
