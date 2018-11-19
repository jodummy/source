package StringClass;

import java.util.Objects;

//person 01°ú ºñ±³
public class Person03 {
	String name;
	int age;

	public Person03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false)
			return false;
		Person p = (Person) obj;
		return Objects.equals(this.name, p.name) && this.age == p.age;
	}

	@Override
	public String toString() {
		return String.format("Person{name=\"%s\", age=%d}", name, age);
	}
}