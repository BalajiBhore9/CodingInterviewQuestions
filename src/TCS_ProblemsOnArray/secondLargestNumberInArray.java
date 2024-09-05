package TCS_ProblemsOnArray;

public class secondLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,45,90,5,99};
		int max = arr[0];
		int secondlargest = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]>max)
				{
					max = arr[i];
				}else if(arr[j]>secondlargest && arr[j]<max)
				{
					secondlargest = arr[j];
				}
			}
		}
		System.out.println("The second largest number in the array is: " +secondlargest);
	}
}
