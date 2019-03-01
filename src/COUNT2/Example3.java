package COUNT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Example3 {
	static void solution(int[] a) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0 && a[i] % 3 != 0)
				list.add(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			if (i < list.size())
				a[i] = list.get(i);
			else
				a[i] = -1;
		}

	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 };
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}