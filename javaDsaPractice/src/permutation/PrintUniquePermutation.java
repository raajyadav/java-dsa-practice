package permutation;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintUniquePermutation {
    static LinkedHashSet<String> p = new LinkedHashSet<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		printPermutation(s);
		System.out.println("All unique Permutations are: ");
		for(String x:p) 
			System.out.println(x);
		System.out.println("Total Permutation is: "+p.size());
	}
	public static void printPermutation(String s) {
		permutation("", s);
	}
	public static void permutation(String prefix, String remaining) {
		if(remaining.length() ==0) {
			p.add(prefix);
			return;
		}
		for(int i = 0; i<remaining.length();i++) {
			char ch = remaining.charAt(i);
			String left = remaining.substring(0, i);
			String right = remaining.substring(i+1);
		permutation(prefix + ch, left+right);	
		}
	}
}
