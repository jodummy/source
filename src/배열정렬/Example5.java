package 배열정렬;

import java.util.Arrays;

public class Example5 {
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 22), new Person("전우치", 23) };
		Arrays.sort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));
	}
}