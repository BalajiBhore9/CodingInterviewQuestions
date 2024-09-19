package Top20Programs;

public class Ex_03_MaxElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {10,3,85,33,73};
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println(max);
	}
}
