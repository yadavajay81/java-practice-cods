package interviewcodetest;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class MapConcurrencyTest {

	public static void main(String[] args) throws InterruptedException {
		
		int threadCount = 1000;
		
		
		Hashtable<String, Integer> map = new Hashtable<>();
		/**
		 *  Execution Time: 224 ms
			Final Map Size: 10
			Map Contents: {key9=990, key8=985, key7=988, key6=983, key5=988, key4=991, key3=992, key2=996, key1=986, key0=991}

		 */
		
		//ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		/**
		 * 
		 *  Execution Time: 209 ms
			Final Map Size: 10
			Map Contents: {key1=982, key2=984, key0=968, key5=990, key6=994, key3=986, key4=991, key9=994, key7=993, key8=991}
		 * 
		 */
		
		Runnable task = () -> {
			for(int i = 0; i < 10; i++) {
				String key = "key" + (i%10);
				map.put(key, map.getOrDefault(key, 0)+1);
				//System.out.println(key);
			}
			
		};
		
		//task.run();
		
		//System.out.println(map);
		
		Thread[] threads = new Thread[threadCount];
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        long end = System.currentTimeMillis();

        System.out.println("Execution Time: " + (end - start) + " ms");
        System.out.println("Final Map Size: " + map.size());
        System.out.println("Map Contents: " + map);
		

	}

}
