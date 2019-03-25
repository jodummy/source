package 알고리즘;

import java.util.Random;

public class sort {
	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	static void swap(int[] a, int i, int j) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}

	static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i)
			for (int j = i + 1; j < a.length; ++j)
				if (a[i] > a[j])
					swap(a, i, j);
	}

	static int search2(int[] a, int value) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) { 
			int middle = (start + end) / 2;
			System.out.println(middle);
			if (a[middle] < value)
				start = middle + 1;
			else if (a[middle] > value)
				end = middle - 1;
			else
				return middle;
		}
		return -1;
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10];
		int[] b = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(20);
		sort(a);
		print(a);
		System.out.println();
		System.out.println(search2(b, 9));
	}
}
