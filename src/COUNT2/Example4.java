package COUNT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

	static String[] convertToArray(String s) {
		for (int i = 0; i < s.length(); i++) {
		
		}
		return null;

	}

	public static void main(String[] args) {
		String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
				"1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
		for (String s : a) {
			String[] t = convertToArray(s);
			System.out.println(Arrays.toString(t));
		}
	}
}
