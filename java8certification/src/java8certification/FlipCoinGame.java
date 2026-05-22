package java8certification;

import java.util.Arrays;

public class FlipCoinGame {
    public static void main(String[] args) {
    	int[] flips = {0,1,1,1,1};
    	
    	int totalcount = maximizeOneAndCount(flips);
    	
    	System.out.println("Modified filips: "+ Arrays.toString(flips));
    	System.out.println("Total One count: "+totalcount);
    	System.out.println("================================================");
    	
    	int[] ar = {1, 0,3, 2, 6, 0, 9};
    	
    	addZeroAtEnd(ar);
    	
    	System.out.println("Updated Array: "+Arrays.toString(ar));
    	
    	
    	
    	
    	
    }

	private static void addZeroAtEnd(int[] ar) {
		int index = 0;
		int n = ar.length;
		for(int i=0; i<n; i++) {
			if(ar[i] != 0) {
				
				ar[index++] = ar[i];
				
			}
		}
		while (index < n) {
            ar[index++] = 0;
        }
		
	}

	private static int maximizeOneAndCount(int[] flips) {
		int count =0;
		
		for(int i=0; i<flips.length; i++) {
			if(flips[i] ==0) {
				flips[i] = 1;
			}
			count++;
		}
		return count;
	}
}

