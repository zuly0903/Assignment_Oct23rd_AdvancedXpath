package Nov_5th_Sat.assignment_6thNov;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Class_No3 {
	static int i;

	public static void main(String[] args) {

		System.out.println("This is the third class");
		method1();
		method2();
		method3();
		method4();
		method5();
		Class_No3 no3 = new Class_No3();
		no3.method6();
		no3.method7(i);
		no3.method8();
		no3.method9();
		no3.method10();
	}

	static void method1() {
		int age = 23;
		int votingAge = 18;
		if(age > votingAge) {
			System.out.println("You can vote");
		}else {
			System.out.println("You are not old enough to vote");
		}
	}
	
	static void method2() {
		String type = "Clothing",
			   type1 = "Jewlery",
			   type3 = "Shoes";
		System.out.println(type+" "+type1+" "+type3);
		
	}
	
	static void method3() {
		LinkedList<String> cars =  new LinkedList<String>();
		cars.add("Adui");
		cars.add("Benz");
		cars.add("BMW");
		System.out.println(cars);
		LinkedList<String> price = new LinkedList<String>();
		price.add("60000");
		price.add("50000");
		price.add("55000");
		System.out.println(price);
		
	}
	
	static void method4() {
		HashMap<String, String> color = new HashMap<String, String>();
		color.put("Audi", "Black");
		color.put("BMW", "White");
		System.out.println(color);
		HashMap<String, String> from = new HashMap<String, String>();
		from.put("Audi", "German");
		from.put("BMW", "German");
		System.out.println(from);
	}
	
	static void method5() {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
	
	void method6() {
		LocalDateTime myDate = LocalDateTime.now();
		System.out.println(myDate);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDate.format(format);
		System.out.println("After format: "+formattedDate);
	}
	
	void method7(int i) {
		int a = 5;
		int b = 1;
		for(i = 0; i <= a; i = i+b) {
			if(i == 4) {
				break;
			}
		}
		System.out.println(i);
	}
	
	void method8() {
		int n = 5;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			System.out.println(array);
		}
	}
	
	void method9() {
		String name[] = {"Max", "Rana", "Peter"};
		int age[] = {33, 27, 25};
		System.out.println(name.length);
		System.out.println(age[2]);
	}
	
	
	void method10() {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Green");
		color.add("Black");
		System.out.println(color);
		
		ArrayList<String> color1 = new ArrayList<String>();
		color1.add("White");
		color1.add("Grey");
		System.out.println(color1);
	}
}
