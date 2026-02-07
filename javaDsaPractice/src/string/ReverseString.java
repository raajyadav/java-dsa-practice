package string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "java";
        String rev = reverseString(s);
		
		System.out.println(rev);
	}
	
	public static String reverseString(String s) {
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		return rev;
	}
}
