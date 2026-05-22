package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequenceOptimized {

	public static void main(String[] args) {
		 int[] numsArr = {10, 9, 2, 5, 3, 7, 101, 18};
	        System.out.println("Length of LIS: " + lengthOfLIS(numsArr)); // Output: 4

	}

	private static int lengthOfLIS(int[] nums) {
		List<Integer> sub = new ArrayList<>();
		//sub.add(5);
		
		for(int num: nums) {
			
			int pos = Collections.binarySearch(sub, num);
			System.out.println("===pos==="+sub.size());
			System.out.println(pos);
			System.out.println("======");
			
			if(pos < 0) {
			pos = -(pos +1 );	// insertion point
			}
			System.out.println("===after -(pos +1 )==="+sub.size());
			System.out.println(pos);
			System.out.println("======");
			
			if (pos == sub.size()) {
                sub.add(num); // extend the sequence
            } else {
                sub.set(pos, num); // replace to maintain smallest tail
            }
			
		}
		
		System.out.println(sub);
		
		return sub.size();
	}

}
