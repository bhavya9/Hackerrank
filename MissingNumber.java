package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		int n1 = sc.nextInt();
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < n1; i++) {
			b.add(sc.nextInt());
		}
		List<Integer> copyB = new ArrayList<Integer>();
		copyB = b;
		for (int i = 0; i < a.size(); i++) {
			boolean match = false;
			int temp = a.get(i);
			for (int j = 0; j < b.size(); j++) {
				if (temp == b.get(j)) {
					// a.remove(i);
					// b.remove(i);
					copyB.remove(j);
					match = true;
					break;
				}
			}
			if (match == false) {
				copyB.add(temp);
			}
		}

		Set<Integer> hs = new HashSet<>();
		hs.addAll(copyB);
		copyB.clear();
		copyB.addAll(hs);
		Collections.sort(copyB);
		System.out.println(copyB);
	}

}
