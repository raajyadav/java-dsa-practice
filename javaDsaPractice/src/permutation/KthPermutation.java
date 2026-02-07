package permutation;

import java.util.Scanner;

public class KthPermutation {
    static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		System.out.println("Enter k :");
		int k = sc.nextInt();
		printPermutation(s,k);
		System.out.println("Total permutation is: "+count);
	}
	public static void printPermutation(String s, int k) {
		permutation("", s, k);
	}
	public static void permutation(String prefix, String remaining, int k) {
		if(remaining.length() == 0) {
			count++;
			if(count == k)
			{
				System.out.println(prefix);
			}
			
		return ;	
		}
		for(int i = 0; i<remaining.length();i++) {
			char ch = remaining.charAt(i);
			String left = remaining.substring(0, i);
			String right = remaining.substring(i+1);
		permutation(prefix + ch, left + right, k);	
		}
	}
}
