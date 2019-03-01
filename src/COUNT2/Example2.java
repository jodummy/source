package COUNT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example2 {
	static void solution(List<Integer> a) {
		Iterator<Integer> it = a.iterator();

		while (it.hasNext()) {
			int value = it.next();
			if (value % 2 == 0)
				it.remove();
		}
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.addAll(Arrays.asList(new Integer[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 }));
		System.out.println(a.toString());
		solution(a);
		System.out.println(a.toString());
	}

}
