package Nov_5th_Sat;

public class Wrapper_class {
// what are wrapper classes
// pre-defined classes in Java which can contain primitive data type.
// wrapper classes are always final
// Parsing- logical form of understanding of how to read the value of one object when it gets converted into another type
// Boolean and Character wrapper classes 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String price1 = "12.22";
		String price2 = "2.78";
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		double sum = p1 + p2;
		System.out.println(sum);
		
		String a = "20";
		String b = "30";
		
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		
		int total = A + B;
		System.out.println(total);
		}

}
