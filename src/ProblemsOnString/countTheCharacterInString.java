package ProblemsOnString;

import java.util.HashMap;

public class countTheCharacterInString {

	public static void main(String[] args) {
		
		String str = "Count The Characters";
		HashMap<Character,Integer> hmap = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(hmap.containsKey(str.charAt(i)))
			{
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), count+1);
			}else {
				hmap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hmap);
	}
}
