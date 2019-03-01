package COUNT1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example5 {
	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" }; // ±¸Çö

		Set<String> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for (int i = 0; i < a2.length; i++) {
			set.add(a1[i]);
			set2.add(a2[i]);
		}
		set.removeAll(set2);
		System.out.println(set.toString());

	}
}