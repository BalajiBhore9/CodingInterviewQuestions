package Top20Programs;

public class Ex_04_MinElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {10,33,93,3,76};
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println(min);
	}
}
