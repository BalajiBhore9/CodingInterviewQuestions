package ProblemsOnString;

public class sumOfDigitInaString {

	public static void main(String[] args) {
		
		String str = "j9a124v4a697";
		int sum = 0;
		for(int i=0;i<str.length();i++)
		{
			char temp = str.charAt(i);
			if(Character.isDigit(temp))
			{
				int num = Integer.parseInt(String.valueOf(temp));
				sum = sum + num;
			}
		}
		System.out.println("Total sum of digit is: "+sum);
	}
}
