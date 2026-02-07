package flowControl;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		double marks = sc.nextDouble();
		
		String result = (marks >= 33)?"PASS":"FAIL";
		
		System.out.println(result);
	}
}

