package Nov_5th_Sat.assignment_6thNov;

public class Class_No4 {

	public static void main(String[] args) {

		System.out.println("This is the fourth class");
		method1();
		method3();
		method4();
		method5();
		
		Class_No4 myMethod = new Class_No4();
		myMethod.method6();
		myMethod.method7();
		myMethod.method8();
		myMethod.method9();
		myMethod.method10();
	}
	


	static void method1() {
		int id[] = {001, 002, 003};
		int age[] = {23, 45, 39};
		display(id, age);
	}
	
	private static void display(int[] id, int[] age) {

		System.out.println("   ID    Age");
		for(int i = 0; i< 3; i++) {
			System.out.println(String.format("%4d%8s", id[i], age[i]));
		}
	}
	
	static void method3() {
		String weekdays[] = {"Monday ", "Tuesday ", "Wednesday "};
		String weekdays1[] = {"Thursday ", "Friday ", "Saturday "};
		for(int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i]);
		}
		for(int j = 0; j < weekdays1.length; j++) {
			System.out.print(weekdays1[j]);
		}
	}
	
	static void method4() {
		int a = 0;
		int b = 2;
		do {
			System.out.print(a);
			a++;
		}while(a < 5);
		
		do {
			System.out.print(b);
			b++;
		}while(b <= 8);
	}
	
	static void method5() {
		int i = 10;
		int j = 9;
		while(i < 15) {
			System.out.print(i);
			i++;
		}
		while(j <= i) {
			System.out.print(j);
			j++;
		}
	}
	
	void method6() {
		int a = 8;
		int b = 9;
		if(a < b) {
			System.out.println("b is greater than a");
		}
	}
	
	void method7() {
		int time = 10;
		int time2 = 23;
		if(time < time2) {
			System.out.println("Good Morning");
		}else {
			System.out.println("Good Evening");
		}
	}
	
	void method8() {
		int a = 77;
		int b = 98;
		System.out.println(Math.sqrt(a));
		System.out.println(Math.sqrt(b)-Math.sqrt(a));
	}
	
	void method9() {
		int randomNum = (int)(Math.random()*55);
		System.out.println(randomNum);
		int random = (int)(Math.random()*389);
		System.out.println(random);
	}
	
	void method10() {
		int number = 9;
		double myNumber = number;
		System.out.println(myNumber);
	}

}
