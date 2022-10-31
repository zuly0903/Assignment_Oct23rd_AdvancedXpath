package oct29_sat;

public class Assignment_29Oct_Sat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern1(5);
		pattern2(5);
		pattern3(5);
	}
	
	static void pattern1(int n) { 
        int i, j;  
        for(i=1; i<=n; i++) { 
        	 for(j=2*(n-i); j>=0; j--) { 
                     
                System.out.print(" "); 
            } 
               for(j=1; j<=i; j++) { 
                   
                System.out.print("* "); 
            }           
            System.out.println(); 
        } 
        System.out.println("---------------------------");
	 }

	
	static void pattern2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
	}
	
	static void pattern3(int n) {
		 for (int i= 1; i<= n ; i++)
	        {
	            for (int j=i; j <n ;j++)            
	        {
	                System.out.print(" ");
	            }
	            for (int k=1; k<=i;k++) { 
	            	System.out.print("*");
	            	}
	            System.out.println(" "); 
	            } 
	        for (int i=n; i>=1; i--){
	            for(int j=i; j<=n;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=1; k<i ;k++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	 
	        }
		
    } 
	
	
}
