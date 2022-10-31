package oct29_sat;

public class nested_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1();
		pattern2();
		pattern3(5);
	}
	
	static void pattern1() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		System.out.println("--------------------------");
	}
	
	static void pattern2() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

	}
	
	static void pattern3(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i +1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}

	
	
}
