package unit_7;

public class BinarySearch {
	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		
		int result = binarySearch(arr, x);
		if (result == -1){
			System.out.println("Element not present");	
		}
		else{
			System.out.println("Element found at " + "index " + result);	
		}
	}
	
	static int binarySearch(int arr[], int x) {
		int lowBoundry = 0;
		int highBoundry = arr.length - 1;
		
		while (lowBoundry <= highBoundry) {	
			int m = lowBoundry + (highBoundry - lowBoundry) / 2;
			if (arr[m] == x){
				return m;
			}
			
			if (arr[m] < x){
				lowBoundry = m + 1;
			}
				
			else{
				highBoundry = m - 1;	
			}
		}
		
		return -1;
	}
}