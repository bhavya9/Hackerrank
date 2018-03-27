package hackerrank;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean f = false;
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			StringBuilder input1 = new StringBuilder();
			input1.append(s);
			input1 = input1.reverse();
			for (int j = 1; j < s.length(); j++) {
				// System.out.println(Math.abs(s.charAt(j) - s.charAt(j-1)));
				// System.out.println(Math.abs(s.charAt(j) - s.charAt(j-1)));
				if (Math.abs(s.charAt(j) - s.charAt(j - 1)) != Math.abs(input1.charAt(j) - input1.charAt(j - 1)))
					f = true;
			}
			if (f)
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
		}

	}
}