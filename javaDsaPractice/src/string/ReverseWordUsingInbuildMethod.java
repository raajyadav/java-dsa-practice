package string;

	public class ReverseWordUsingInbuildMethod {
	
		public static void main(String[] args) {
			String s = "How are  you";
			String reverse = reverseWord(s);
			System.out.println(reverse);
		}
		public static String reverseWord(String s) {
			String[] str = s.split("\\s+");
			String word = " ";
			for(String x:str) {
				word = x+" "+word;
			}
		  return word.trim();	
		}
	}
