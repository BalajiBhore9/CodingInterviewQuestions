package Top20Programs;

public class Ex_05_SortArrayInAscending {

	public static void main(String[] args) {
		
		int[]arr = {9,5,7,8,3,6,2,4,1};
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
			System.out.println(arr[i]);
		}
	}
}
