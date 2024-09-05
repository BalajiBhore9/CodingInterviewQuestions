package TCS_ProblemsOnArray;

public class ascendingArray {

	public static void main(String[] args) {
		// Rearrange the array in ascending order
		int[] arr= {6,1,37,10,5,50,39};
		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}
