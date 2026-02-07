package method;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(11));
	}
	
	public static boolean isPrime(int n) {
		if(n <= 0) {
			return false;
		}
		if(n == 1 || n == 2) {
			return true;
		}
		
		for(int i = 2;i<n-1;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
