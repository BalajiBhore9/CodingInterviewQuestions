package TCS_ProblemsOnArray;

import java.util.Arrays;

public class medianOfArray {

	public static void main(String[] args) {
		
		 int[] arr = {1, 4, 6, 45, 2, 3, 9};
		 Arrays.sort(arr);
		 //Find the median
		 double median ;
		 int len = arr.length;
		 if(len % 2==0)
		 {
			 //even number of elements
			 median = (arr[len/2-1] + arr[len/2]) / 2.0;
		 }else {
			// Odd number of elements
			 median = arr[len/2];
		 }
		// Print the median
		 System.out.println("Median: "+median);
	}
}
