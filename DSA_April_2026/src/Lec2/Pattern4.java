package Lec2;

public class Pattern4 {

	public static void main(String[] args) { 
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
		while(row <= n)
		{
			// space forming here...
			int i = 1;
			while(i <= space)
			{
				System.out.print("  ");
				i++;
			}
			
			// star forming here...
			int j = 1;
			while(j <= star)
			{
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			space--;
			row++;
			star++;
		} 
	}

}
