package array;

public class LinearSearch2 {

	public static void main(String[] args) {
		String[] fruits = {"Mango","Orange","Apple","Grapes","Banana"};
		String  key = "Banana";
		int index = getIndex(fruits,key);
		if(index == -1) {
			System.out.println("Not found");
		}else {
			System.out.println("Key is in Index : "+index);
		}
	}
	public static int getIndex(String[] fruits, String key) {
		for(int i=0;i<fruits.length;i++) {
			if(fruits[i].equalsIgnoreCase(key)) {
				return i;
			}
		}
		return -1;
	}

}
