package TCS_ProblemsOnArray;

public class averageOfAllElementInArray {

	public static void main(String[] args) {
		
		int[] arr= {6,1,37,10,80,33};
		int avg = arr.length;
		int sum = 0;
		for(int i=0;i<avg;i++)
		{
			sum = sum+arr[i];	
		}
		float avrg = sum/avg;
		System.out.print(avrg);
	}
}
