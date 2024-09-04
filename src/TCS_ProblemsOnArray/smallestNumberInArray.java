package TCS_ProblemsOnArray;

public class smallestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,45,90,5,99};
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		// Print the smallest number
        System.out.println("The smallest number in the array is: " + smallest);
	}
}
