package unit_07_sort_and_search;

public class InsertionSort {

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6 };
			
		System.out.println("Before sort:");
		printArray(arr);
		sort(arr);
		System.out.println("After sort:");
		printArray(arr);
	}

	static void sort(int array[]) {
		int length = array.length;
		
		for (int indexA = 1; indexA < length; ++indexA) {
			int key = array[indexA];
			int indexB = indexA - 1;
			
			while (indexB >= 0 && array[indexB] > key) {
				array[indexB + 1] = array[indexB];
				indexB = indexB - 1;
			}
			
			array[indexB + 1] = key;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		
		for (int i = 0; i < n; ++i){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
}