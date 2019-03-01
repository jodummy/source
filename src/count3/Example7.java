package count3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Example7 {
	static void solution(List<Integer> a) {
		List<Integer> list = a;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int value = it.next();
			if (value % 2 == 0 || value % 3 == 0)
				it.remove();
		}
		a = list;
	}

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 30; ++i)
			a.add(random.nextInt(8) + 1);
		System.out.println(a.toString());
		solution(a);
		System.out.println(a.toString());

	}
}