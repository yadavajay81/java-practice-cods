import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
//		Input: nums = [2,7,11,15], target = 18
//				Output: [1,2]
//				Explanation: Because nums[0] + nums[1] == 18, we return [1, 2]
		
		
		
		String a = "ajay";
		//System.out.println(a.toCharArray().toString());
		Map<Character, Integer> freq = new HashMap<>();
		
		for(char c:a.toCharArray()) {
			//System.out.println(c);
			//a.getOrDefault(c, 0);
			freq.put(c, freq.getOrDefault(c, 0)+1);
			System.out.println(freq.getOrDefault(c, 0));
			
		}
		System.out.println("======================");
		System.out.println(freq);
		System.out.println("======================");
		
		
int[] nums = {2,7,3,11,15};
int target = 18;
int complement = 4;
System.out.println(arraysum(nums, target));

HashMap<Integer, Integer> nummap = new HashMap<>();

for(int i=0; i<nums.length; i++) {	
nummap.put(i, nums[i]);
}

System.out.println(nummap);
System.out.println(nummap.get(complement));
System.out.println(nummap.containsKey(complement));


List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

System.out.println("Sequential processing:");
numbers.stream()
        .forEach(number -> System.out.println(number + " processed by " + Thread.currentThread().getName()));

System.out.println("\nParallel processing:");
numbers.parallelStream()
        .forEach(number -> System.out.println(number + " processed by " + Thread.currentThread().getName()));

}

	public static ArrayList<Integer> arraysum(int[] num, int target) {
		ArrayList<Integer> arList = new ArrayList<>();
		int complete;
		
		for(int i=0; i<num.length; i++) {
			complete = target - num[i];
			for(int j=i; j<num.length; j++) {
				if(complete==num[j]) {
					arList.add(i);
					arList.add(j);
					//return arList;
				}
			}
			
		}
		
		return arList;
	}
	
	
//count character frequency from string 
	
	//public Map<Character, Integer> charFreq(String str){
		//Map<Character, Integer> feqMap = new HashMap<>();
		
	//}

	
}
