package string;

public class ReverseEachElement {

	public static void main(String[] args) {
       String s = "Java is easy";
       String word = "";
       String result = "";
       
       for(int i = 0; i<s.length(); i++) {
    	   char ch = s.charAt(i);
    	   
    	   if(ch != ' ') {
    		   word = word + ch;
    	   }else {
    		   for(int j = word.length()-1;j>=0;j--) {
    			   result = result + word.charAt(j);
    		   }
    		   result = result + " ";
    		   word = " ";
    	   }
       }
       for(int j=word.length()-1; j>= 0; j--) {
    	   result = result + word.charAt(j);
       }
       System.out.println(result);
	}
}
