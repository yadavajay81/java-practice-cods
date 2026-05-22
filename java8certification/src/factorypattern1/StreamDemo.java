package factorypattern1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(7);
		al.add(2);
		al.add(11);
		al.add(5);
		al.add(3);
		
		al.stream().forEach(i -> System.out.println(i));
		al.stream().forEach(System.out::println);
		//Sorting ase
		List<Integer> sortal= al.stream().sorted().collect(Collectors.toList());
		System.out.println(sortal);
		
		//sorting dse
		List<Integer> sortDseal = al.stream().sorted((a1,a2)->a2.compareTo(a1))
				.collect(Collectors.toList());
		System.out.println(sortDseal);
		
		//Filter
		List<Integer> filal = al.stream().filter(i -> i%2==0)
				.collect(Collectors.toList());
		System.out.println(filal);
		//filter and print
		al.stream().filter(i -> i>5).forEach(i->System.out.println(i));
		
		//Mapping
		List<Integer> mapal = al.stream().map(i -> i*2)
				.collect(Collectors.toList());
		System.out.println(mapal);
		
		//Find min
		Integer minal = al.stream().min((a1,a2)->a1.compareTo(a2)).get();
		System.out.println(minal);
		
		//Find Max
		Integer maxal = al.stream().max((a1,a2)->a1.compareTo(a2)).get();
		System.out.println(maxal);
		
		//Count
		long countal = al.stream().count();
		System.out.println(countal);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(LocalDate.now().getDayOfMonth());
		
		LocalDate bd = LocalDate.of(1981, 01, 01);
		LocalDate today = LocalDate.now();
		Period p = Period.between(bd, today);
		System.out.println(p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days ");
	
		ZoneId z = ZoneId.systemDefault();
		System.out.println(z);
		

	}

}
