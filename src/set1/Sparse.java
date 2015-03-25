package set1;

public class Sparse {
	
	public static void value(int[][] input){
		for (int i = 0; i < input.length; i++){
			for (int j = 0; j < input[i].length; j++){
				if (input[i][j] != 0){
					System.out.println("[" + (i+1) + ", " + (j+1) + "]: " + input[i][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int test1[][] = new int[][] {
				{0,0,0,0},
				{0,6,0,0},
				{8,0,0,4}
		};
		//Expected output: 
		//[1, 1]: 6
		//[2, 0]: 8
		//[2, 3]: 4
		System.out.println("test1:");
		value(test1);
		
		int test2[][] = new int[][] {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
		};
		//Expected output: 
		//
		System.out.println("\ntest2:");
		value(test2);
		
		int test3[][] = new int[][] {
				{1,2,3,4,5}
		};
		//Expected output: 
		//[1, 1]: 1
		//[1, 2]: 2
		//[1, 3]: 3
		//[1, 4]: 4
		//[1, 5]: 5
		System.out.println("\ntest3:");		
		value(test3);
		
		int test4[][] = new int[][] {
				{26,0,0,0,0},
				{0,-2,0,0,0},
		};
		//Expected output:
		//[1, 1]: 26
		//[2, 2]: -2
		System.out.println("\ntest4");		
		value(test4);
	}
	
}
