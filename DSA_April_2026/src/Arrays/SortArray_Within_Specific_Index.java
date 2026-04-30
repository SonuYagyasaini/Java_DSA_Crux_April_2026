package Arrays;

public class SortArray_Within_Specific_Index {

	public static void main(String[] args) { 
		int[] arr = {3 , 5 , 1 , 7 , 8 , 6 , 11, 78 , 9 , 0 , 56};
		Reverse(arr , 2 , 6);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Reverse(int[] arr , int i , int j)
	{
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
