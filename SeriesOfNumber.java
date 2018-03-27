package hackerrank;

import java.util.Scanner;

public class SeriesOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long max = 10 ^ 18;

		for (long i = 0; i < x; i++) {
			long temp = sc.nextLong();
			temp = temp % 1000000007;
			long sum = temp * temp;

			sum = sum % 1000000007;
			// long temp1=(long)sum;
			System.out.println(sum);
		}

	}
}