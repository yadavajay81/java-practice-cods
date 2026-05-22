package programming.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		//LocalDateTime dt = LocalDateTime.of(yy,mm,dd,h,m,s,n);
		
		//1981-01-01 8:27
		
		LocalDateTime dt = LocalDateTime.of(1981,Month.JANUARY,01,8,27);
		System.out.println(dt);
		
		System.out.println("After 6 month: "+dt.plusMonths(6));
		System.out.println("Before 6 month: "+dt.minusMonths(6));

	}

}
