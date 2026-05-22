package java8certification;

import java.util.*;

public class LeetcodeArraySorting {

	/*
	 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, 
	 * and all elements in arr2 are also in arr1.

		Sort the elements of arr1 such that the relative ordering of 
		items in arr1 are the same as in arr2. Elements that do not appear 
		in arr2 should be placed at the end of arr1 in ascending order.
		
	 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
	 * Output: [2,2,2,1,4,3,3,9,6,7,19]
	 * 
	 * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
	 *	Output: [22,28,8,6,17,44]
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		LeetcodeArraySorting sol = new LeetcodeArraySorting();
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(sol.relativeSortArray(arr1, arr2)));
        
        System.out.println("New solution =============");
        //System.out.println(Arrays.toString(sol.relativeSortArray1(arr1, arr2)));
        
        System.out.println("New solution =============");
        System.out.println(Arrays.toString(sol.relArrSort(arr1, arr2)));
    }
	
	
	
	
	public int[] relArrSort(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("here"+arr2[i]);
			for(int j = 0; j < arr1.length; j++) {
				System.out.println("here"+arr1[j]);
				if(arr1[j] == arr2[i]) {
					list.add(arr1[j]);
					arr1[j] = -1;
					
				}
			}
			
		}
		
		Arrays.sort(arr1);
		for(int k = 0; k < arr1.length; k++) {
			if(arr1[k] != -1) {
				list.add(arr1[k]);
			}
		}
		
		
		return list.stream().mapToInt(Integer::intValue).toArray();
		
	}
	
	
	
	
	
	
	public int[] relativeSortArray1(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        
        System.out.println("arr1 start: "+Arrays.toString(arr1));
        System.out.println("arr2 start: "+Arrays.toString(arr2));

        // Traverse through the relative order array
        for (int i = 0; i < arr2.length; i++) {
            // Traverse through the target array
            for (int j = 0; j < arr1.length; j++) {
                // If element in target array matches with relative order element
                if (arr1[j] == arr2[i]) {
                    // Add it to the result array
                    result.add(arr1[j]);
                    // Mark the element in target array as visited
                    arr1[j] = -1;
                }
            }
        }
        
        
        System.out.println("After mark -1");
        System.out.println("arr1 : "+Arrays.toString(arr1));
        System.out.println("result : "+result.toString());
        

        // Sort the remaining elements in the target array
        Arrays.sort(arr1);
        // Add the remaining elements to the result array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                result.add(arr1[i]);
            }
        }

        // Convert ArrayList to array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

	
	
	
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Create a map to store index positions from arr2
        Map<Integer, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            orderMap.put(arr2[i], i);
        }
        
     // Step 2: Convert int[] to Integer[] (to use a custom comparator)
        Integer[] arr1Wrapper = Arrays.stream(arr1).boxed().toArray(Integer[]::new);

        // Step 2: Sort arr1 using a custom comparator
        Arrays.sort(arr1Wrapper, (a, b) -> {
            if (orderMap.containsKey(a) && orderMap.containsKey(b)) {
                return orderMap.get(a) - orderMap.get(b); // Sort by arr2 order
            } else if (orderMap.containsKey(a)) {
                return -1; // a comes first
            } else if (orderMap.containsKey(b)) {
                return 1;  // b comes first
            } else {
                return Integer.compare(a, b); // Normal ascending order
            }
        });

     // Step 4: Convert back to int[]
        return Arrays.stream(arr1Wrapper).mapToInt(Integer::intValue).toArray();
    }

}
