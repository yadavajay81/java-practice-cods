package programming.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1981, 01, 01);
		LocalDate today = LocalDate.of(2023, 12, 06);
		
		Period p = Period.between(birthday, today);
		
		System.out.println(p);
		
		System.out.printf("Your age is %d years %d months %d Days",
				p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate dethDay = LocalDate.of(1981+60, 01, 01);
		Period p1 = Period.between(today, dethDay);
		int d = p1.getYears()*365 + p1.getMonths()*30 +p1.getDays();
		System.out.printf("\nYou will be on the earth only %d Days. Hurry up to do important things", d);

	}

}
