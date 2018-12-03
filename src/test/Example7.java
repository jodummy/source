package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Example7 {
	int n = 0;

	static void solution(List<Integer> a) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.size(); ++i) {
			if ((a.get(i) % 2) != 0 && (a.get(i) % 3) != 0)
				list.add(a.get(i));
		}
		a.removeAll(a);
		a.addAll(list);
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