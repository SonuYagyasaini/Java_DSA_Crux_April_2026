package Lec2;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 5;
		int space = 0;
		int star = 1;
		int row = 2;
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
			if(row <= 3)
			{
				space++;
			}
			else if( row > 3)
			{
				space--;
			}
			row++;
		}

	}

}
