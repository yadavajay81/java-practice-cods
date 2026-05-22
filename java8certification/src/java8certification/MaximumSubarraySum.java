package java8certification;

import java.util.ArrayList;

public class MaximumSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        ArrayList<Integer> subArr = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if(currentSum + nums[i] >nums[i]) {
            	subArr.add(nums[i]);	
            }
            maxSum = Math.max(maxSum, currentSum);
        }
System.out.println(subArr);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }
}

