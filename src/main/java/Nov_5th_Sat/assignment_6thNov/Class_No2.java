package Nov_5th_Sat.assignment_6thNov;

import java.util.Scanner;

public class Class_No2 {
	static int a;
	static int b;
	static String name;
	static String brand;

	public static void main(String[] args) {

		System.out.println("this is my second class");
		method1(a, b);
		method2(name, a);
		method4(brand);
		method5(a,b);
		method3();
		
		Class_No2 myMethod = new Class_No2();
		myMethod.method6();
		myMethod.method7();
		myMethod.method8();
		myMethod.method9();
		myMethod.method10();
	}
	
	static void method1(int a, int b) {
		a = 20;
		b = 30;
		System.out.println(a-b);
	}
	
	static void method2(String name, int a) {
		name = "John";
		a = 20;
		System.out.println(name+" is"+a+" years old");
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		String username;
		System.out.println("Please enter your name: ");
		username = sc.nextLine();
		System.out.println("Username is "+ username);
	}
	
	static void method4(String brand) {
		brand = "BMW";
		int price = 50000;
		System.out.println("the brand of the car : "+brand+" price is : "+price);
		
	}
	
	static void method5(int a, int b) {
		a = 89;
		b = 78;
		System.out.println(a/b);
	}
	
	void method6(){
		String account = "savings account";
		int balance = 2000;
		Scanner sc = new Scanner(System.in);
		int deposit;
		System.out.println("Your Account Type is : "+account);
		System.out.println("Enter the amount you want to deposit: ");
		deposit = sc.nextInt();
		balance = balance + deposit;
		System.out.println("Balance after deposit is : "+balance);
	}
	
	void method7() {
		String accType = "Savings account";
		String accType1 = "Checking account";				
		System.out.println("Please enter 1 for"+accType+ " or 2 for " +accType1+" to choose your account type: ");
		Scanner sc = new Scanner(System.in);
		String selection = sc.nextLine();
		if(selection.equals("1") || selection.equals("1")) {
			System.out.println("you choose Savings Account");
		}else {
			System.out.println("yoou choose Checking Account");
		}
	}
	
	void method8() {
		double balance = 200;
		double amount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("Please enter your choice: ");
		String choice;
		choice = sc.nextLine();
		if(choice.equals("1")) {
			System.out.println("Please enter the amount you want to deposit: ");
			amount = sc.nextDouble();
			balance = balance + amount;
			System.out.println("your current balance is : "+balance);
			
		}else {
			System.out.println("Please enter the amount you want to withdraw: ");
			amount = sc.nextDouble();
			balance = balance - amount;
			System.out.println("Your current balance is : ");
		}
		
	}
	
	void method9() {
		String car = "toy car";
		String color = "green";
		System.out.println(car+" color is "+color);
	}
	
	void method10() {
		double a = 3.14;
		double b = 9.456;
		System.out.println(Math.max(a, b));
	}
}
