import java.util.Scanner;

/**
 * Sort.java
 * Sorting ints, doubles, and strings using different sorting methods in an order.
 * March 22nd, 2018
 * @author WayneChau
 */
public class Sort {
	
	/**
	 * Tests if the method works by printing the list derived from the sorting methods.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		//int [] arr = {1,8,3,19,7};
		//double [] arr = {3.4,78.9,17.9,32.3,2.4};
		//String [] arr = {"Hello","Cat","Dog","Rat","Eagle"};
		//selectionSort(arr);
		//insertionSort(arr);
		//bubbleSort(arr);
		//for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr [i] + " ");
		//}
	}
	
	/**
	 * Selects the first value in the array and swaps it with the smallest value found in the array. It is repeated until all values are arranged in the correct order.
	 * @param arr - The int array inputed by the user.
	 * @return void
	 */
	public static void selectionSort(int [] arr) {
		int min = 0;
		for (int i=0; i < arr.length; i++) {
			min = i;
			for (int j=i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap (arr, i, min);
		}
	}

	/**
	 * Swaps two int value from the array.
	 * @param arr - The int array.
	 * @param index1 - The position in the array to be switched.
	 * @param index2 - The position in the array to be switched.
	 */
	private static void swap (int [] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	/**
	 * Selects the first value in the array and swaps it with the smallest value found in the array. It is repeated until all values are arranged in the correct order.
	 * @param arr - The double array inputed by the user.
	 * @return void
	 */
	public static void selectionSort(double [] arr) {
		int min = 0;
		for (int i=0; i < arr.length; i++) {
			min = i;
			for (int j=i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap (arr, i, min);
		}

	}

	/**
	 * Swaps two double value from the array.
	 * @param arr - The double array.
	 * @param index1 - The position in the array to be switched.
	 * @param index2 - The position in the array to be switched.
	 */
	private static void swap (double [] arr, int index1, int index2) {
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	/**
	 * Selects the first value in the array and swaps it with the smallest value found in the array. It is repeated until all values are arranged in the correct order.
	 * @param arr - The string array inputed by the user.
	 * @return void
	 */
	public static void selectionSort(String [] arr) {
		int min = 0;
		for (int i=0; i < arr.length; i++) {
			min = i;
			for (int j=i+1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			swap (arr, i, min);
		}
	}

	/**
	 * Skips the first value and switch the next value with the value on the left if it is smaller until it is no longer smaller. It is repeated until all values are arranged in the correct order.
	 * @param arr - The int array inputed by the user.
	 * @return void
	 */
	public static void insertionSort(int [] arr) {
		int j = 0;
		for (int i=1; i < arr.length; i++) {
			j = i;
			while (arr[j] < arr[j-1]) {
				swap (arr, j, j-1);
				j--;
			}
		}
	}

	/**
	 * Skips the first value and switch the next value with the value on the left if it is smaller until it is no longer smaller. It is repeated until all values are arranged in the correct order.
	 * @param arr - The double array inputed by the user.
	 * @return void
	 */
	public static void insertionSort(double [] arr) {
		int j = 0;
		for (int i=1; i < arr.length; i++) {
			j = i;
			while (arr[j] < arr[j-1]) {
				swap (arr, j, j-1);
				if (j > 1) {
					j--;
				}
			}
		}
	}

	
	/**
	 * Skips the first value and switch the next value with the value on the left if it is smaller until it is no longer smaller. It is repeated until all values are arranged in the correct order.
	 * @param arr - The string array inputed by the user.
	 * @return void
	 */
	public static void insertionSort(String [] arr) {
		int j = 0;
		for (int i=1; i < arr.length; i++) {
			j = i;
			while (arr[j].compareTo(arr[j-1]) < 0) {
				swap (arr, j, j-1);
				if (j > 1) {
					j--;
				}
			}
		}
	}

	/**
	 * 
	 * @param arr - The int array inputed by the user.
	 * @return void
	 */
	public static void bubbleSort(int [] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=1; j < arr.length; j++) {
				if (arr[j] < arr[j-1]) {
					swap (arr, j, j-1);
				}
			}
		}

	}

	/**
	 * 
	 * @param arr - The double array inputed by the user.
	 * @return void
	 */
	public static void bubbleSort(double [] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=1; j < arr.length; j++) {
				if (arr[j] < arr[j-1]) {
					swap (arr, j, j-1);
				}
			}
		}
	}

	/**
	 * 
	 * @param arr - The string array inputed by the user.
	 * @return void
	 */
	public static void bubbleSort(String [] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[j-1]) < 0) {
					swap (arr, j, j-1);
				}
			}
		}
	}

	/**
	 * Swaps two string value from the array.
	 * @param arr - The string array.
	 * @param index1 - The position in the array to be switched.
	 * @param index2 - The position in the array to be switched.
	 */
	private static void swap (String [] arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
