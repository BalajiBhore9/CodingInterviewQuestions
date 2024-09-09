package TCS_ProblemsOnArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDublicatesFromSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 4, 6, 45, 2, 3, 9, 1, 1};
		// Sort the array
		Arrays.sort(arr);
		System.out.println("The sorted array is: ");
		// Remove duplicates using a Set
		Set<Integer> uniqueElements = new HashSet<>();
		for(int num : arr)
		{
			uniqueElements.add(num);
		}
		// Print the result
		System.out.println(uniqueElements);
	}
}
