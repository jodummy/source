package list;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("three");
		list.add(0, "zero");
		list.add(2, "two");
		for (String s : list)
			System.out.printf("%s ", s);
		for (int i = 0; i < list.size(); ++i)
			System.out.printf("%s ", list.get(i));
	}
}
