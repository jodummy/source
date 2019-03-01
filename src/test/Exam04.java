package test;

import java.util.Arrays;

public class Exam04 {
	static Person[] clone(Person[] a) {
		return Arrays.copyOf(a, a.length);
	}

	static boolean compareIdentity(Person[] a1, Person[] a2) {
		return a1 == a2;
	}

	static boolean compareEquality(Person[] a1, Person[] a2) {
		int count = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i].age == a2[i].age && a1[i].name.equals(a2[i].name)) {
				count++;
			}

		}
		return count == 2 ? true : false;
	}

	public static void main(String[] args) {
		Person[] a1 = new Person[] { new Person("È«±æµ¿", 18), new Person("ÀÓ²©Á¤", 21) };
		Person[] a2 = clone(a1);
		System.out.println(compareIdentity(a1, a2));
		System.out.println(compareEquality(a1, a2));
	}
}