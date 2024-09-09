package TCS_ProblemsOnArray;

import java.util.HashSet;
import java.util.Set;

public class arrayIsSubsetOfAnotherArray {

	public static void main(String[] args) {
		
		 int[] arr1 = {1, 2, 3, 4, 5, 6}; // Larger array
	     int[] arr2 = {2, 4, 6};           // Subset array

	     // Convert arr1 to a Set for fast lookups
	     Set<Integer>set = new HashSet<>();
	     for(int num:arr1)
	     {
	    	 set.add(num);
	     }
	     // Check if all elements of arr2 are in the Set
	     boolean isSubset =  true;
	     for(int num:arr2)
	     {
	    	 if(!set.contains(num))
	    		 isSubset = false;    // If any element is not found, it's not a subset
	    	 break;
	     }
	     // Output result
	     System.out.println("Is arr2 a subset of arr1? \n" + isSubset);
	}
}
