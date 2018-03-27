import java.util.Scanner;
/**
 * Sort.java
 * Sorting different types of values using various sorting algorithms.
 * March 25th, 2018
 * @author WayneChau
 */
public class Sort {
	
	/**
	 * Tests if the methods work by printing the answers derived from the sorting methods.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int [] arr = {1,8,3,19,7};
		//double [] arr = {3.4,78.9,17.9,32.3,2.4};
		//String [] arr = {"Hello","Cat","Dog","Rat","Eagle"};

		//selectionSort(arr);
		insertionSort(arr);
		//bubbleSort(arr);
		//for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr [i] + " ");
		//}

		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr [i] + " ");
		}
	}
	/**
	 * Determines the smallest value in the array and swaps it with the first value. Repeats with the next value in the array until the array is rearranged correctly.
	 * @param arr - The int array reference.
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
	 * Swaps one value with another value in the array.
	 * @param arr - The int array reference.
	 * @param index1 - The position of one value in the array.
	 * @param index2 - The position of the other value in the array.
	 */
	private static void swap (int [] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	/**
	 * Determines the smallest value in the array and swaps it with the first value. Repeats with the next value in the array until the array is rearranged correctly.
	 * @param arr - The double array reference.
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
	 * Swaps one value with another value in the array.
	 * @param arr - The double array reference.
	 * @param index1 - The position of one value in the array.
	 * @param index2 - The position of the other value in the array.
	 * return void
	 */
	private static void swap (double [] arr, int index1, int index2) {
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	/**
	 * Determines the smallest value in the array and swaps it with the first value. Repeats with the next value in the array until the array is rearranged correctly.
	 * @param arr - The String array reference.
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
	 * Skips the first value considered as sub-sorted and starts with the second value. Place the value in the proper position moving sub-sorted list as necessary. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The int array reference.
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
	 * Skips the first value considered as sub-sorted and starts with the second value. Place the value in the proper position moving sub-sorted list as necessary. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The double array reference.
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
	 * Skips the first value considered as sub-sorted and starts with the second value. Place the value in the proper position moving sub-sorted list as necessary. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The String array reference.
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
	 * Compares the first value with the value on the right. The highest value is swapped to the highest position in the array. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The int array reference.
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
	 * Compares the first value with the value on the right. The highest value is swapped to the highest position in the array. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The double array reference.
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
	 * Compares the first value with the value on the right. The highest value is swapped to the highest position in the array. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The String array reference.
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
	 * Swaps one value with another value in the array.
	 * @param arr - The String array reference.
	 * @param index1 - The position of one value in the array.
	 * @param index2 - The position of the other value in the array.
	 * @return void
	 */
	private static void swap (String [] arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
