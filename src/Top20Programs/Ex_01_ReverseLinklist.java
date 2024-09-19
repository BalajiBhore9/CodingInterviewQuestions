package Top20Programs;

import java.util.LinkedList;

public class Ex_01_ReverseLinklist {

	public static void main(String[] args) {
	
		LinkedList<Integer>list = new LinkedList<>();	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
	}
}
