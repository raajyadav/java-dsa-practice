package permutation;

import java.util.Scanner;

public class PrintPermutation {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		printPermutation(s);
		System.out.println("Total permutation is: "+count);
	}
	public static void printPermutation(String s) {
		permutation("",s);	
	}
	public static void permutation(String prefix, String remaining) {
		if(remaining.length() == 0) {
			System.out.println(prefix);
			count++;
			return;
		}
		for(int i = 0;i<remaining.length();i++) {
			char ch = remaining.charAt(i);
			String left = remaining.substring(0,i);
			String right = remaining.substring(i+1);
		permutation(prefix + ch, left + right );	
		}
	}
	     
}
