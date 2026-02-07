package string;

public class ReverseWord {

	public static void main(String[] args) {
		String str  = "How are    you";
		String reverse = reverseWord(str);
		System.out.println(reverse);
	}
	public static String reverseWord(String s) {
		String temp = "" , word = "";
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch != ' ') {
				temp = ch + temp;
			}
			if(ch == ' '|| i == s.length()-1) {
				word = word + temp+" " ;
				temp="";
			}
		}
		
		return word.trim();
	}
}
