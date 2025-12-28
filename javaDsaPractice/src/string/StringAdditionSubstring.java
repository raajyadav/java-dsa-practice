package string;

public class StringAdditionSubstring {

	public static void main(String[] args) {
		String s1 = "raj";
		String s2 = " java";
		
		String s3 = "this is demo";
		
		System.out.println(s1+s2);     //raj java
		System.out.println(s1+10);     //raj10
		System.out.println(s1+10+20);  //raj1020
		System.out.println(10+s1+20);   //10raj20
		System.out.println(10+20+s1);   //30raj
		System.out.println(s1+20/10);   //raj2
		System.out.println(s1+20*10);   //raj200
//		System.out.println(s1+10-20);
		
		System.out.println(s1.concat(s2)); //raj java
		System.out.println(String.join(":", s1,s2));  // raj: java
		
		//Substring
		System.out.println(s3.subSequence(3, 9)); //s is d
		System.out.println(s3.substring(3)); //s is demo
		System.out.println(s3.substring(2, 7));  //is is
	}
}
