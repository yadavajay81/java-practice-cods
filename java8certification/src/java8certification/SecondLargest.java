package java8certification;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] array = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest: " + findSecondLargest(array));

	}

	private static int findSecondLargest(int[] nums) {
		if(nums == null || nums.length < 2) return -1;
		
		Arrays.sort(nums);
		
		
		return nums[nums.length-2];
	}

}
