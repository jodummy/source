package StringClass;

//��ü ���� �׸���4
class Family {
	Person father, mother;
	Person[] children;

	public Family() {
		father = new Person("�ƺ�", 45);
		mother = new Person("����", 36);
		children = new Person[3];
		children[0] = new Person("�Ƶ�1", 12);
		children[1] = new Person("�Ƶ�2", 9);
		children[2] = new Person("��1", 7);
	}
}

public class Person02 {
	static Family family;

	public static void main(String[] args) {
		family = new Family();
	}
}