package Lec3;

public class Pattern14 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
		while (row <= 2*n-1)
		{
			// space forming....
			int i = 1;
			 
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			
			//star forming...
			int j = 1;
			 
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// mirror forming...
			if(row < n)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			
			System.out.println();
			row++;
		}

	}

}

