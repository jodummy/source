package COUNT1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
	static void add(List<Integer> list, int count) {
		for (int i = 0; i < count; i++)
			list.add(i);
	}

	static void removeEven1(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int value = it.next();
			if (value % 2 == 0)
				it.remove();
		}
	}

	static void addEven(List<Integer> list) {
		int size = list.size() * 2;

		for (int i = 0; i < size; i += 2) {
			list.add(i, i);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		add(list, 10);
		System.out.println(list.toString());
		removeEven1(list);
		System.out.println(list.toString());
		addEven(list);
		System.out.println(list.toString());
	}
}