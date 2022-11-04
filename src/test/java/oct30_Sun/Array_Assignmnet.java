package oct30_Sun;

//Why index of Array starts from Zero

//The index of an array indicates how far away the first element is.
//Therefore, the distance between the first element and the starting element is 0.
//As a result, arrays begin at 0.

public class Array_Assignmnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		int[][] b = { {1,2,3,4,5,6}, {5,6,7,8,9,10}, {9,10,11,12,13,14} , {14,15,16,17,18,10} , {18,19,20,21,22,23}};
		
		for(int n = 0; n < b.length; n++) {
			for(int k = 0; k < b[n].length; k++) {
				System.out.print(b[n][k]+" ");
			}
			System.out.println();
		}

	}

}
