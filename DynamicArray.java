package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		int lastans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		ArrayList<Integer>[] s = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			s[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < q; i++) {
			int query = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int index = (x ^ lastans) % n;
			if (query == 1) {
				s[index].add(y);
			} else {
				lastans = s[index].get(y % (s[index].size()));
				System.out.println(lastans);

			}

		}
	}
}
