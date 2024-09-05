package TCS_ProblemsOnArray;

public class secondSmallestNumberInArray {

	public static void main(String[] args) {
		
		int arr[] = {6,1,37,10,5,50};
	    int lowest =arr[0];
	    int sec_lowest =0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr.length;j++) 
	    	{
	    		if (lowest > arr[i])
	    		{
	    			sec_lowest = lowest;
	    			lowest = arr[i];
	            }else if (sec_lowest > arr[j] && lowest != arr[j]) 
	            {
	            	sec_lowest = arr[j];
	            }
	    	}
	    }
	    System.out.println(sec_lowest);
	}
}
