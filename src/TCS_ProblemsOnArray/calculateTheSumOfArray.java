package TCS_ProblemsOnArray;

public class calculateTheSumOfArray {

	public static void main(String[] args) {
		
		int[] arr= {6,1,37,10,33};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum +arr[i] ;
		}
		System.out.println("Total sum of the elements of the array: "+sum);
	}
}
