package COUNT1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example3 {
	public static void main(String[] args) {
		String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" }; // ±¸Çö

		Set<String> set = new HashSet<>();

		for (String str : a)
			set.add(str);

		System.out.println(set.toString());
	}
}
