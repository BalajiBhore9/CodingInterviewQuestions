package TCS_ProblemsOnArray;

import java.util.HashMap;

public class countTheFrequecyInArray {

	public static void main(String[] args) {
		// count the frequency of each element in an array
		
		int [] arr = {10,20,20,10,10,20,5,60,95};
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				int count = hmap.get(arr[i]);
				hmap.put(arr[i], count+1);
			}else 
			{
				hmap.put(arr[i], 1);
			}
		}
		System.out.println(hmap);
	}
}
