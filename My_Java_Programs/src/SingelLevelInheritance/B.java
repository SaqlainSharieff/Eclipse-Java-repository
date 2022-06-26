package SingelLevelInheritance;

class A {
	static String s1 = "parent";
	int a = 10;

	public void m1() {
		System.out.println("in the non ststic method parent class");
	}

	public static void m3() {
		System.out.println("in the ststic method parent class");
	}
}

class B extends A {
	static String s2 = "child";
	int b = 230;

	public void m2() {
		System.out.println("in the non ststic class B child");
	}

	public static void m4() {
		System.out.println("in the ststic method of child class");

	}

	public static void main(String[] args) {
		B a1 = new B();
		System.out.println(a1.b);
		a1.m2();
		System.out.println(s2);
		m4();
		System.out.println(a1.a);
		a1.m1();
		System.out.println(s1);
		m3();

	}

}
