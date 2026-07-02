package Lec14;

public class two_D_Array {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][1]); 
		int row = arr.length;
		int col = arr[0].length;
		System.out.println(row + " " + col);
		int[][] input = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		Display(input);
		

	}
	
	public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
