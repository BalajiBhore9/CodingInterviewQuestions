package TCS_ProblemsOnArray;

import java.util.HashSet;
import java.util.Set;

public class removeDublicatesFromUnsortedArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 4, 6, 45, 2, 3, 9, 1, 1};
		Set<Integer> uniqueElements = new HashSet<>();
		for(int num :arr)
		{
			uniqueElements.add(num);
		}
		System.out.println(uniqueElements);
	}
}
