package programming.datetime;

import java.time.*;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yyyy);
		
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println();
		
		
		int hh = time.getHour();
		int m = time.getMinute();
		int sec = time.getSecond();
		int nsec = time.getNano();
		System.out.printf("%d:%d:%d:%d",hh,m,sec,nsec);
		System.out.println();
		
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		int ddt = date.getDayOfMonth();
		int mmt = date.getMonthValue();
		int yyyyt = date.getYear();
		
		System.out.println(ddt+"-"+mmt+"-"+yyyyt);
		
		System.out.printf("%d-%d-%d",ddt,mmt,yyyyt);
		System.out.println();
		
		
		int hht = time.getHour();
		int mt = time.getMinute();
		int sect = time.getSecond();
		int nsect = time.getNano();
		System.out.printf("%d:%d:%d:%d",hht,mt,sect,nsect);
		System.out.println();
		
		

	}

}
