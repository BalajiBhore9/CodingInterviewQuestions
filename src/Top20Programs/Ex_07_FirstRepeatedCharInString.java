package Top20Programs;

public class Ex_07_FirstRepeatedCharInString {

	public static void main(String[] args) {
		
		String str = "shoot tutorial";
        boolean isFound = false;
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    System.out.println(str.charAt(i)+" is the first character that occurs");
                    isFound = true;
                    break;
                }
            }
            if(isFound) {
                break;
            }
        }
	}
}
