package Nov_5th_Sat.assignment_6thNov;

import java.util.Scanner;

public class Class_No5 {

	public static void main(String[] args) {

		System.out.println("This is the fifth class");
		method1();
		method2();
		method3();
		method4();
		method5();
		
		Class_No5 myMethod = new Class_No5();
		myMethod.method6();
		myMethod.method7();
		myMethod.method8();
		myMethod.method9();
		myMethod.method10();
		
	}
	
	static void method1() {
		int amount = 2000;
		double interest = 0.4;
		System.out.println("your interest payment is : ");
		System.out.println(amount*interest);
	}
	
	static void method2() {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print even numbers: ");
		i = sc.nextInt();
		int number = 2;
		while(number <= i) {
			System.out.println(number+" ");
			number = number + 2;
		}
	}
	
	static void method3() {
		int number;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print odd numbers : ");
		number = sc.nextInt();
		a = 1;
		while(a <= number) {
			System.out.println(a+" ");
			a = a + 2;
		}
	}
	
	static void method4() {
		String letters = "Hello World";
		int countLetters = letters.split("\\s").length;
		System.out.println(countLetters);
	}
	
	static void method5() {
		String words = "Morning";
		String revers = "";
		System.out.println("Original words is :"+words);
		for(int i = 0; i < words.length(); i++) {
			revers = words.charAt(i) + revers;
		}
		System.out.println("Reversed words is : "+revers);
	}
	
	void method6() {
		int num = 12345;
		int reverse = 0;
		System.out.println("Original number is : "+num);
		
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed number is : "+reverse);
	}
	
	void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String name = sc.nextLine();
		System.out.println("Your name is : "+name);
	}
	
	void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birthday and age :");
		int bd = sc.nextInt();
		int age = sc.nextInt();
		System.out.println("Your birthday : "+bd);
		System.out.println("Your age : "+age);
	}
	
	void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which high school did you go :");
		String school = sc.nextLine();
		System.out.println("Your school : "+school);
	}
	
	void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you work ? ");
		String ans = sc.nextLine();
		System.out.println("Your answered : "+ans);
	}

}
