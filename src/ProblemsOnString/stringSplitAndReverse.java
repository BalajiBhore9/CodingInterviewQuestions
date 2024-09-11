package ProblemsOnString;

public class stringSplitAndReverse {

	public static void main(String[] args) {
		
		String str = "Reverse The String";
		String[] s = str.split(" ");
		String rev = " ";
		for(String w:s)
		{
			String reve = " ";
			for(int i=w.length()-1;i>=0;i--)
			{
				reve = reve + w.charAt(i);
			}
			rev = rev + reve;
		}System.out.println(rev);
	}
}
