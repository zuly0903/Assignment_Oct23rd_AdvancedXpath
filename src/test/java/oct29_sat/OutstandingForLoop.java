package oct29_sat;

public class OutstandingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 20; i++) {
			System.out.print((i*2)+" ");
		}
		
		System.out.println("");  //first 20 even numbers
		
		for(int a = 1; a <= 10; a++) {
			System.out.print((a*5)+" ");
		}
		
		System.out.println("");  // first 10 multiple of 5

		for(int b = 100; b >= 50; b--) {
			System.out.print(b+" ");
		}
		
		System.out.println("");  // from 100 to 50

		for(int c = 200; c >= 100; c = c-5) {
			System.out.print(c+" ");
		}
		
		System.out.println("");  // multiple of 5 200 to 100
		
		int sum = 0;
		for(int d = 1; d <= 100; ++d) {
			sum = sum + d;
		
		}
		System.out.print(sum);
		System.out.println();    // sum of 100 number
		
		int count, sumOf = 0;
		for(int n=1; n<=10; n++) {
			count = 0;
			for(int i = 2; i <= n/2; i++) {
				if(n%i == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && n != 1) {
				sumOf = sumOf + n;
			}
		}
		System.out.print(sumOf+" ");  // sum of 10 prime
	}
	
		
		
}
