package programming.datetime;

import java.time.*;

public class ZoneIdTest {

	public static void main(String[] args) {
		ZoneId z = ZoneId.systemDefault();
		System.out.printf("\nYou are in %s zone. ",z);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		
		ZonedDateTime zt = ZonedDateTime.now(la);
		
		System.out.printf("\nCurrent Date and Time in LA %s", zt);

	}

}
