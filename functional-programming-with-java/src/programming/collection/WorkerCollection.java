package programming.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class WorkerCollection {

	public static void main(String[] args) {
		
		ArrayList<Worker> worker = new ArrayList<Worker>();
		
		worker.add(new Worker("Ajay","Hr",200));
		worker.add(new Worker("Ajay1","Hr1",200));
		worker.add(new Worker("Ajay2","Hr2",200));
		worker.add(new Worker("Ajay3","Hr3",200));
		worker.add(new Worker("Ajay4","Hr4",200));
		worker.add(new Worker("Ajay5","Hr",2000));
		worker.add(new Worker("Ajay5","Hr1",500));
		worker.add(new Worker("Ajay5","Hr",1000));
		//System.out.println(worker);
		
		
		Map<String, List<Worker>> gb = worker.stream().collect(Collectors.groupingBy(Worker::getDep));
		
		System.out.println(gb);
		
		
		//get worker whoo have salary 200
		
		List<Worker> worList = worker.stream().filter(a-> a.getSal()==200)
				.collect(Collectors.toList());
		
		System.out.println("Salary ==200 "+ worList);
		
		Collections.sort(worker, (s1,s2)->s1.getName().compareTo(s2.getName()));
		//System.out.println(worker);
		
		Collections.sort(worker, (s1,s2)->s2.getName().compareTo(s1.getName()));
		//System.out.println(worker);
		
		
		//Max salary worker
		
		Optional<Worker> maxSalWorker = worker.stream().max(Comparator.comparingInt(Worker::getSal));
		System.out.println("Max salary worker: "+maxSalWorker);
		
		Optional<Worker> minSalWorker = worker.stream().min(Comparator.comparing(Worker::getSal));
		System.out.println("Min salary worker: "+minSalWorker);
		
		//find the Worker whose salary is greator than 200 and less than 2000
		List<Worker> listWoker = worker.stream().filter(w -> w.getSal()>200 && w.getSal()<2000
				&& w.getDep()=="Hr")
				.collect(Collectors.toList());
		System.out.println(listWoker);

	}

}
