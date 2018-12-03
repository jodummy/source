package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

	static List<String> solution(String[] a1, String[] a2, String[] a3) {
		List<String> listResult = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();

		for (int i = 0; i < a1.length; i++) {
			list1.add(a1[i]);
			list2.add(a2[i]);
			list3.add(a3[i]);
		}

		for (String t : list1) {
			if (list2.contains(t) && list3.contains(t)) {
				listResult.add(t);
			}
		}

		return listResult;
	}

	public static void main(String[] args) {
		String[] a1 = { "A", "B", "D", "F", "G" };
		String[] a2 = { "B", "C", "F", "H", "I" };
		String[] a3 = { "B", "F", "G", "H", "I" };
		System.out.println(solution(a1, a2, a3));
	}
}