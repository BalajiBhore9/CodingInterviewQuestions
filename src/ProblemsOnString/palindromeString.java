package ProblemsOnString;

public class palindromeString {

	public static void main(String[] args) {
		
		String str = "aassaa";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
	}
}
