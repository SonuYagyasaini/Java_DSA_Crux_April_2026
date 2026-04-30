package Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		InsertionSort(arr);
	}

	public static void InsertionSort(int[] arr) { 
		for (int i = 0; i < arr.length; ++i) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		Display(arr);
	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
