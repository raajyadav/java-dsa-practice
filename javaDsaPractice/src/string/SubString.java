package string;

//Q:1) check one String is SubString of other or not
public class SubString {

	public static void main(String[] args) {
		String s1 = "abacbdbcea";
		String s2 = "bdb";
		System.out.println(isSubString(s1,s2));
	}
	public static boolean isSubString(String s1, String s2) {
		
		for(int i = 0; i<= s1.length()-s2.length();i++) {
			int j;
			for(j = 0;j<s2.length();j++) {
				if(s1.charAt(i+j) !=s2.charAt(j))
				break;
			}
			if(j==s2.length())
				return true;
		}
		return false;
	}
	
}
