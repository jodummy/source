package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Exam05 {

	static void removeEvenNumbers(Collection<Integer> c) {
		Iterator<Integer> it = c.iterator();
		while (it.hasNext()) {
			int value = it.next();
			if (value % 2 == 0)
				it.remove();
		}
	}

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++i)
			c.add(i);
		removeEvenNumbers(c);
		System.out.println(c.toString());
	}
}
