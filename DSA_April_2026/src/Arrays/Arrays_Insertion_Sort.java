package Arrays;
import java.util.Scanner;
public class Arrays_Insertion_Sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int N = scanner.nextInt(); 
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		} 
		insertionSort(arr); 
		for (int num : arr) {
			System.out.print(num + " ");
		} 
		scanner.close(); 
	}
	public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
