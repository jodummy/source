package 알고리즘;

import java.util.Scanner;

public class obs {

	private static void method(int num, int i, int j, int mid, int sw) {
		if (num < i) return;
		if (abs(mid - i) + 1 <= j && j <= (mid >= i ? (mid + i - 1) : (num - sw)))  
			System.out.print(" ");
		else  
			System.out.print("*");
		if (j == num) {
			System.out.println();
			sw = mid < i ? ++sw : sw;
			method(num, i + 1, 1, mid, sw);
		} else method(num, i, j + 1, mid, sw);
		
	}

	public static int abs(int num) {
		return num > 0 ? num : num * -1;

	}

	public static void main(String[] args) {
		System.out.print("적어봐 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println();
		method(num, 1, 1, num / 2 + 1, 1);

	}

}
