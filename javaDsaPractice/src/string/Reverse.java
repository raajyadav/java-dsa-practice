package string;

public class Reverse {

	public static void main(String[] args) {
		
		String name = "Raj";
		String reverse = reverse(name);
		System.out.println(reverse);
	}
	
	public static String reverse(String s) {
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}
}
