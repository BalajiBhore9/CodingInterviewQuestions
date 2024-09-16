package ProblemsOnString;

import java.util.Arrays;

public class stringAnagram {

	public static void main(String[] args) {
		
		/* An anagram of a string is another string that contains the same characters,
		 only the order of characters can be different. */
		
		String str1 = "AabbCC";
		String str2 = "ccBBaa";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the string are not aragram");
		}else {
		
			char[] str3 = str1.toCharArray();
			char[] str4 = str2.toCharArray();
			Arrays.sort(str3);
			Arrays.sort(str4);
			if(Arrays.equals(str3, str4))
			{
				System.out.println("Both the strings are anagram");
			}else {
				System.out.println("Both the strings are not anagram");
			}
		}
	}
}
