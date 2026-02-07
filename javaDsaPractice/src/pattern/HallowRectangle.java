package pattern;

public class HallowRectangle {

	public static void main(String[] args) {
		hallowRectangle(6,7);
	}
	
	public static void hallowRectangle(int totRows, int totCols) {
		for(int i = 1; i<=totRows;i++) {
			for(int j = 1;j<=totCols;j++) {
				if(i==1 || i==totRows || j==1 || j==totCols)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
}
