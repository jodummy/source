package COUNT2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {
	static int solution(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

		}
		return 0;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] { 1, 7, 1, 8, 5, 2, 2, 3, 5, 3, 1, 3, 7 });
		System.out.println(a.toString());
		int maxValue = solution(a);
		System.out.println(maxValue);
	}
}