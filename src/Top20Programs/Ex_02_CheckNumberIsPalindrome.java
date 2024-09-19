package Top20Programs;

import java.util.Scanner;

public class Ex_02_CheckNumberIsPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the num to check is Palindorme or not: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rem =0;
		while(num>0)
		{
			rem = (rem*10)+num%10;
			num = num/10;
		}
		if(temp==rem)
			System.out.println("The given number is palindrome");
		else
			System.out.println("The given number is not palindorme");
	}
}
