package Lec4;

public class HCF {

	public static void main(String[] args) {
		int divis = 36; 
		int divid = 60;
		int rem = 0;
		while(divid % divis != 0)
		{
			  rem = divid % divis;
			  divid = divis;
			  divis = rem;
		}
		int lcm = (divis * divid)/rem;
		System.out.println("hcf is : "+rem);
		System.out.println("lcm is : "+lcm);

	}

}
