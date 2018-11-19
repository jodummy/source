package interfaceEx;

//������ ���� �����ϱ�
//list - > arraylist
//1.upcasting
//2.���������ϱ� ����
//3.���� �κ��� �־�� �Ѵ�
interface A {
	void method1();
}

interface B extends A {
	void method2();
}

class S1 implements A {
	public void method1() {
		System.out.println("S1 method1()");
	}
}

class S2 implements B {
	public void method1() {
		System.out.println("S2 method1()");
	}

	public void method2() {
		System.out.println("S2 method2()");
	}
}
