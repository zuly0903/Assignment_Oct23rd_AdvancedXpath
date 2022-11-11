package OOPs;

public class MyMethods {
	
	static int age;
	static String name;

	public static void main(String[] args) {

		System.out.println("This is main method");
		Method1();
		Method2();
		Method3();
		Method4(age, name);
		Method5();
		MyMethods m = new MyMethods();
		System.out.println(m.Method6());
		MyMethods n = new MyMethods();
		System.out.println(n.Method7(name));
		Method8();
		Method9();
		Method10();
	}
	
	public static void Method1() {
		System.out.println("this is method 1");
	}
	
	public static void Method2() {
		System.out.println("this is method 2");
	}
	
	public static void Method3() {
		System.out.println("this is method 3");
	}
	
	public static void Method4(int age, String name) {
		age = 21;
		name = "John";
		System.out.println("Name: "+name+" Age: "+age);
	}
	
	public static void Method5() {
		System.out.println("this is method 5");
	}
	
	public int Method6() {
		int a = 2;
		int b = 3;
		return a+b;
	}
	
	public String Method7(String name) {
		name = "John";
		return name;
	}
	
	public static void Method8() {
		System.out.println("this is method 8");
	}
	
	public static void Method9() {
		System.out.println("this is method 9");
	}
	
	public static void Method10() {
		System.out.println("this is method 10");
	}

}
