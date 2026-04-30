package Arrays;

public class Selection_Sort {

	public static void main(String[] args) { 
		int[] arr = {64,25,12,22,11}; 
		SelectionSort(arr);
	}
	
	public static void SelectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp; 
		}
		Display(arr);
	}
	
	public static void Display(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
