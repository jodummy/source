package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
	public static void main(String[] args) {

		String pattern = "<(\\/?)(?!\\/####)([^<|>]+)?>";
		String s = "<tr><td>È«±æµ¿</td><td>18</td></tr><tr><td>ÀÓ²©Á¤</td><td>19</td></tr>"
				+ "<span>false</span><div><span>true</span></div>";

	}
}