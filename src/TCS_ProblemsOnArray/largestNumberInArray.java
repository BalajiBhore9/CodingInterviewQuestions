package TCS_ProblemsOnArray;

public class largestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,45,90,5,99};
		int largestarr = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largestarr)
			{
				largestarr = arr[i];
			}
		}
		// Print the largest number
        System.out.println("The largest number in the array is: " + largestarr);
	}
}
