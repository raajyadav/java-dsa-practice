package method;

import java.util.Scanner;

public class BinomialCoefficient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter r:");
		int r = sc.nextInt();

		int binoCoeff = getBinomialCoefficient(n, r);
		System.out.println("Binomial Coefficient is : "+binoCoeff);

	}

	public static int getBinomialCoefficient(int n, int r) {
		int fact_n = getFactorial(n);
		int fact_r = getFactorial(r);
		int fact_nmr = getFactorial(n - r);

		int binomialCoefficient = fact_n / (fact_r * fact_nmr);

		return binomialCoefficient;

	}

	public static int getFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
