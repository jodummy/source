package ���Խ�;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1d {
	public static void main(String[] args) {
		String s = "Telephone: 032-431-2323 010-5533-2299 02-555-3388 010-222-5678";
		String regex = "010-(?<a>[0-9]{3,4})-(?<b>[0-9]{4})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.printf("��ü:%s ", matcher.group(0));
			System.out.printf("����:%s ", matcher.group("a"));
			System.out.printf("��ȣ:%s\n", matcher.group("b"));

			// �� ���ԽĿ� �Ʒ��� ���Խ��� ���̴� ?<�̸�> �κ��� �����̴�.
		}
	}
}