package Nov_5th_Sat;

public class Boxing_Uboxing {

	//Boxing
	//

	public static void main(String[] args) {
		// Boxing (manually) -- conversion of primitive to wrapper class object
		int x = 20;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		//Auto-boxing
		int a = 50;
		Integer b = a;
		System.out.println(b);
		
		//Unboxing -- conversion of wrapper class object to primitive data type
		Integer result = 60;
		int newResult = result.intValue();
		System.out.println(newResult);
		
		//Auto Unboxing
		Integer z = 40;
		int z1 = z;
		System.out.println(z1);
	}

}
