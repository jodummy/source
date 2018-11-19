package interfaceEx;

//다형성 구조 정의하기
//list - > arraylist
//1.upcasting
//2.유지보수하기 쉽다
//3.공통 부분이 있어야 한다
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
