package flowControl;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
//		WAJP to take a character input and print it is alphabet or not using if else statement.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
	    char ch = sc.next().charAt(0);
	    
	    if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
	    	System.out.println(ch+ " is Alphabet ");
	    }else {
	    	System.out.println(ch+" Not a Alphabet");
	    }
	}
}
