package Lec20;

public class StringPermutation {

	public static void main(String[] args) {
		 String  ques = "abc";
		 Permutation(ques , "");

	}
	public static void Permutation(String ques , String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String S1 = ques.substring(0,i);
			String S2 = ques.substring(i+1);
			Permutation(S1 + S2 , ans + ch);
		}
	}

}
