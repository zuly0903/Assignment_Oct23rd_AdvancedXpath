package Nov_5th_Sat.assignment_6thNov;

public class Class_No1 {

	public static void main(String[] args) {

		System.out.println("this is the first class");
		Method1();
		Method2();
		Method3();
		Method4();
		Method5();
		
		Class_No1 myMethod = new Class_No1();
		System.out.println(myMethod.Method6());
		System.out.println(myMethod.Method7());
		System.out.println(myMethod.Method8());
		System.out.println(myMethod.Method9());
		System.out.println(myMethod.Method10());
		
	}

	public static void Method1() {
		int a = 1, b = 3;
		System.out.println(a+b);
	}
	
	public static void Method2() {
		String fname = "John", lname = "Doe";
		System.out.println(fname+""+lname);
	}
	
	public static void Method3() {
		int a = 2;
		int b = a;
		System.out.println(b);
	}
	
	public static void Method4() {
		double a = 1.2;
		double b = 2.3;
		System.out.println(a*b);
	}
	
	public static void Method5() {
		boolean ilikecoding = true;
		boolean codingiseasy = false;
		System.out.println(ilikecoding);
		System.out.println(codingiseasy);
	}
	
	public String Method6() {
		String a = "Hello", b = "World";
		return a+b;
		
	}
	
	public int Method7() {
		int a = 6;
		int b = 7;
		return a+b;
	}
	
	public double Method8() {
		double amount = 700.78;
		double balance = amount;
		return balance;
	}
	
	public boolean Method9() {
		int age = 18;
		int age1 = 19;
		return age > age1;
	}
	
	public String Method10() {
		String major = "Finance";
		String course = "331";
		return major + course;
	}
}

