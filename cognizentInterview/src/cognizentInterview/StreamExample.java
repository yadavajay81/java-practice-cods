package cognizentInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		Integer[] intA = {4,5,7,9,3,8,6};
		List<Integer> intL = Arrays.asList(intA);
		System.out.println(intL);
		
		//convert primitive type array to list
		int[] a= {3,4,5,7,9,3,8,6};
		
		List<Integer> newList = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(newList);
		
		intL.parallelStream().forEachOrdered(System.out::println);
		
		System.out.println("New Stream----=============");
		
		String[] nameA = {"Alice", "Bob", "Charlie", "David"};
		List<String> name = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		name.stream().map(String::length).forEach(System.out::println);
		
		List<String> nameMoreThan3 = name.stream().filter(s->s.length()>3).collect(Collectors.toList());
		System.out.println(nameMoreThan3);
		
		for(String s:nameA) {
			System.out.println(s);
		}
		for(String s:name) {
			System.out.println(s);
		}
		
//		Question:
//			You are given a List<List<String>> representing groups of words. Write a Java 
//			function to return a single List<String> containing all words in lowercase, 
//					without duplicates.	
		List<List<String>> words = Arrays.asList(
			    Arrays.asList("Java", "Spring"),
			    Arrays.asList("spring", "Hibernate"),
			    Arrays.asList("JAVA", "hibernate")
			);
//output [java,spring,hibernate]
		
		List<String> newList1= words.stream().flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(newList1);
		
		List<String> uniqueListInLowerCase = newList1.stream().map(str->str.toLowerCase())
				.distinct().collect(Collectors.toList());
		
		System.out.println(uniqueListInLowerCase);
		
		Optional<String> findFirstElm = newList1.stream().findFirst();
		System.out.println(findFirstElm);
		Optional<String> findAnyStringElm = newList1.stream().findAny();
		System.out.println(findAnyStringElm);
		
		Optional<String> findFirstElmParallel = newList1.parallelStream().findFirst();
		System.out.println(findFirstElmParallel);
		Optional<String> findAnyStringElmParallel = newList1.parallelStream().findAny();
		System.out.println(findAnyStringElmParallel);
		

		//forkJoinPool
		ForkJoinPool pool = new ForkJoinPool();
		
		long result1 = pool.invoke(new SumTask(1,2));
		System.out.println("Sum = " + result1);
		
		
		//CompletableFuture
		
		
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            
			
			return "Hello from async!";
        });

        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        System.out.println("Main thread is free to do other work...");
        
        //generate infinite loop using java8
        //Stream.generate(()->"Hellow").forEach(result->System.out.println(result));
        //Stream.generate(()->"Hellow").forEach(System.out::println);
        
        //Remove duplicate from list using java8
        List<Integer> intnumL = Arrays.asList(4,5,9,5,3,6,7,3,9,5);
        List<Integer> distintnumL = intnumL.stream().distinct().collect(Collectors.toList());
        System.out.println(distintnumL);
        
        int[] intnumA = {2,2,2,3,5,9};
        int[] distintnumA = Arrays.stream(intnumA).distinct().toArray();
        System.out.println(Arrays.toString(distintnumA));
        
        //sort Array using java 8
        int[] sortArr = {2,4,9,6,5,6,5,4,4,2,3};
        
        Arrays.stream(sortArr).sorted().forEach(System.out::print);
        System.out.println();
        
        List<Integer> sortList = Arrays.asList(2,4,9,6,5,6,5,4,4,2,3);
        sortList.stream().sorted().forEach(System.out::print);
        
     List<Books> books = Arrays.asList(
    		 new Books("Math", "Bob"),
    		 new Books("English", "Mark"),
    		 new Books("History", "Mark"),
    		 new Books("Science", "Bob"),
    		 new Books("Hindi", "Ram"));
       
        
        
        //Grouping by author
     Map<String,List<Books>> booksGroupByAuthor = books.stream().collect(
        		Collectors.groupingBy(Books::getAuthor));
     
     System.out.println(booksGroupByAuthor);
     booksGroupByAuthor.forEach((author, bookList)->{
    	 System.out.println(author+" :: "+bookList);
     });
        
		
	}
	
}

//new class
class SumTask extends RecursiveTask<Long> {
    private final long start, end;

    public SumTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    protected Long compute() {
        if (end - start <= 10) {
            long sum = 0;
            for (long i = start; i <= end; i++) sum += i;
            return sum;
        } else {
            long mid = (start + end) / 2;
            SumTask left = new SumTask(start, mid);
            SumTask right = new SumTask(mid + 1, end);
            left.fork(); // run left task asynchronously
            return right.compute() + left.join(); // combine results
        }
    }
}

