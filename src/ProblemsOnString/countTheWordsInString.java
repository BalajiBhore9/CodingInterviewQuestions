package ProblemsOnString;

import java.util.HashMap;

public class countTheWordsInString {

	public static void main(String[] args) {
		
		String str = "Java Selenium Java";
		String[] words = str.split(" ");
		HashMap<String,Integer>hmap = new HashMap<>();
		for(String word:words)
		{
			if(hmap.containsKey(word))
			{
				int count = hmap.get(word);
				hmap.put(word, count+1);
			}else {
				hmap.put(word,1);
			}
		}
		System.out.println(hmap);
	}
}
