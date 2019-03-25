package 알고리즘;

import java.util.Scanner;

public class pre2b {
	static void print1(int n) {

		System.out.println();

		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if (j >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void print2(int n, int i, int j) {
		if (n == i) return;
		if (n - 1 <= i + j) System.out.print("*");
		else System.out.print(" ");
		if (j == n - 1) {
			System.out.println();
			print2(n, i + 1, 0);
		} else print2(n, i, j + 1);

	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("행 수를 입력하시오: ");
			int n = scanner.nextInt();
			print1(n);
			System.out.println();
			print2(n, 0, 0);
		}
	}
}
