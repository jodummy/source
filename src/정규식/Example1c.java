package ���Խ�;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1c {
	public static void main(String[] args) {
		String s = "Telephone: 032-431-2323 010-5533-2299 02-555-3388 010-222-5678";
		String regex = "010-([0-9]{3,4})-([0-9]{4})"; // �� ���ԽĿ� �Ʒ��� ���Խ��� ���̴� ( ) ��ȣ�� �����̴�
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) { // ���� ���, ���� ���� ���
			System.out.printf("��ü:%s ", matcher.group(0));
			System.out.printf("����:%s ", matcher.group(1));
			System.out.printf("��ȣ:%s\n", matcher.group(2));

//���ԽĿ��� ( ) ��ȣ�� ���Խ��� �Ϻκ��� ���� �� ����Ѵ�.
//���ԽĿ��� ( ) ��ȣ�� ��ġ�ϴ� �κи� �˰� ���� �� group(int ����) �޼ҵ带 ����Ѵ�.
//Matcher�� group(0) �޼ҵ�� ���Խİ� ��ġ�ϴ� �κ� ��ü�� �����Ѵ�.
//Matcher�� group(1) �޼ҵ�� ���Խİ� ��ġ�ϴ� �κ� �߿��� ù ��° ( ) ��ȣ�� �ش��ϴ� �κ��� �����Ѵ�.
//Matcher�� group(2) �޼ҵ�� ���Խİ� ��ġ�ϴ� �κ� �߿��� �� ��° ( ) ��ȣ�� �ش��ϴ� �κ��� �����Ѵ�.
		}
	}
}