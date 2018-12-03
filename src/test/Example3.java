package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

// 이름 오름차순
class NameAscCompare implements Comparator<Person> {
	@Override
	public int compare(Person arg0, Person arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}
}

//이름 내림차순
class NameDescCompare implements Comparator<Person> {
	@Override
	public int compare(Person arg0, Person arg1) {
		return arg1.getName().compareTo(arg0.getName());
	}
}

//나이 오름차순 
class AgeAscCompare implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		if (a.getAge() > b.getAge())
			return 1;
		else if (a.getAge() < b.getAge())
			return -1;
		else
			return 0;
	}
}

//나이 내림차순 
class AgeDescCompare implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		if (a.getAge() < b.getAge())
			return 1;
		else if (a.getAge() > b.getAge())
			return -1;
		else
			return 0;
	}
}

public class Example3 {

	static void sort1(List<Person> list) {
		Collections.sort(list, new NameAscCompare());
	}

	static void sort2(List<Person> list) {
		Collections.sort(list, new NameDescCompare());
	}

	static void sort3(List<Person> list) {
		Collections.sort(list, new AgeAscCompare());
	}

	static void sort4(List<Person> list) {
		Collections.sort(list, new AgeDescCompare());
	}

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 18));
		list.add(new Person("임꺽정", 19));
		list.add(new Person("전우치", 20));
		sort1(list);
		System.out.println(list.toString());
		sort2(list);
		System.out.println(list.toString());
		sort3(list);
		System.out.println(list.toString());
		sort4(list);
		System.out.println(list.toString());
	}

}