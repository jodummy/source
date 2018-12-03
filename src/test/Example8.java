package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Example8 {
	static int solution(List<Integer> a) {
		int max = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer number : a) {
			if (!map.containsKey(number))
				map.put(number, 0);
			map.put(number, map.get(number) + 1);
		}

		for (int i = 0; i < a.size(); i++) {
			if (map.get(i) != null)
				max = max < map.get(i) ? i : max;
		}
		return max;
	}

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 20; ++i)
			a.add(random.nextInt(10) + 1);
		System.out.println(a.toString());
		int maxValue = solution(a);
		System.out.println(maxValue);
	}
}