package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example2 {
	static List<String> solution(String[] a1, String[] a2, String[] a3) {
		Set<String> set = new HashSet<>();
		Set<String> list1 = new HashSet<>();
		Set<String> list2 = new HashSet<>();
		Set<String> list3 = new HashSet<>();

		for (int i = 0; i < a1.length; i++) {
			list1.add(a1[i]);
			list2.add(a2[i]);
			list3.add(a3[i]);
		}
		// ÇÕÁýÇÕ
		set.addAll(list1);
		set.addAll(list2);

		set.removeAll(list3);

		return new ArrayList<String>(set);
	}

	public static void main(String[] args) {
		String[] a1 = { "A", "B", "D", "F", "G" };
		String[] a2 = { "B", "C", "F", "H", "I" };
		String[] a3 = { "B", "F", "G", "H", "I" };
		System.out.println(solution(a1, a2, a3));
	}
}