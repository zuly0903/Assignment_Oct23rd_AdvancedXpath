package polymorphism;

public class MainMethod_Overloading {

	public static void main(String[] args) {
		main(20);
		main(args = new String[2], args = new String[3]);
		
	}
	
	public static void main(int i) {
		System.out.println("this  is an int type parameter main method");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("this is multiple parameters main method");
	}

}
