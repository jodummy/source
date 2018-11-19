package 정규식;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1c {
	public static void main(String[] args) {
		String s = "Telephone: 032-431-2323 010-5533-2299 02-555-3388 010-222-5678";
		String regex = "010-([0-9]{3,4})-([0-9]{4})"; // 위 정규식와 아래의 정규식의 차이는 ( ) 괄호의 유무이다
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) { // 좋은 기능, 가장 많이 사용
			System.out.printf("전체:%s ", matcher.group(0));
			System.out.printf("국번:%s ", matcher.group(1));
			System.out.printf("번호:%s\n", matcher.group(2));

//정규식에서 ( ) 괄호는 정규식의 일부분을 묶을 때 사용한다.
//정규식에서 ( ) 괄호와 일치하는 부분만 알고 싶을 때 group(int 순서) 메소드를 사용한다.
//Matcher의 group(0) 메소드는 정규식과 일치하는 부분 전체를 리턴한다.
//Matcher의 group(1) 메소드는 정규식과 일치하는 부분 중에서 첫 번째 ( ) 괄호에 해당하는 부분을 리턴한다.
//Matcher의 group(2) 메소드는 정규식과 일치하는 부분 중에서 두 번째 ( ) 괄호에 해당하는 부분을 리턴한다.
		}
	}
}