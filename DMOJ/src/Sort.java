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

		//int [] arr = {1,8,3,19,7};
		//double [] arr = {3.4,78.9,17.9,32.3,2.4};
		String [] arr = {"Hello","Cat","Dog","Rat","Eagle"};

		//selectionSort(arr);
		quickSort(arr);
		//bubbleSort(arr);
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

	//int quickSort
	/**
	 * Calls the quickSort method to sort the array using quick sort.
	 * @param arr - The int array reference.
	 * @return void
	 */
	public static void quickSort (int []arr) {
		quickSort (arr, 0, arr.length-1);
	}

	/**
	 * Pick a pivot value and partition the array so that larger are on the right and smaller are on the left to allow the pivot to be in the correct position in the array. Repeat with left side and right side.
	 * @param arr - The int array reference
	 * @param start - The beginning of the array excluding the pivot.
	 * @param end - The end of the array excluding the pivot.
	 * @return void
	 */
	private static void quickSort(int[]arr, int start, int end) {
		//when array length is 1 value
		if (end-start+1 == 0) {
			return;
		}
		else {
			int pivot = partition (arr, start, end);
			quickSort (arr, start, pivot-1); //left side
			quickSort (arr, pivot+1, end); //right side
		}
	}

	/**
	 * Values smaller than the pivot are placed to the left and values larger than the pivot are placed to the right.
	 * @param arr - The int array reference.
	 * @param start - The beginning of the array excluding the pivot.
	 * @param end - The end of the array excluding the pivot.
	 * @return i+1 - pivot value
	 */
	private static int partition (int []arr, int start, int end) {
		int i = start -1;
		for (int j = start; j < end; j++) {
			//rearrange smaller values to the left
			if (arr[j] < arr[end]) {
				i++;
				swap (arr, i, j);
			}
		}
		//places pivot in correct order within rearranged array 
		swap (arr, i+1, end);
		return i+1; //pivot value
	}

	//double quickSort
	/**
	 * Calls the quickSort method to sort the array using quick sort.
	 * @param arr - The double array reference.
	 * @return void
	 */
	public static void quickSort (double []arr) {
		quickSort (arr, 0, arr.length-1);
	}

	/**
	 * Pick a pivot value and partition the array so that larger are on the right and smaller are on the left to allow the pivot to be in the correct position in the array. Repeat with left side and right side.
	 * @param arr - The double array reference
	 * @param start - The beginning of the array excluding the pivot.
	 * @param end - The end of the array excluding the pivot.
	 * @return void
	 */
	private static void quickSort(double[]arr, int start, int end) {
		//when array length is 1 value
		if (end-start+1 == 0) {
			return;
		}
		else {
			int pivot = partition (arr, start, end);
			quickSort (arr, start, pivot-1); //left side
			quickSort (arr, pivot+1, end); //right side
		}
	}

	/**
	 * Values smaller than the pivot are placed to the left and values larger than the pivot are placed to the right.
	 * @param arr - The double array reference.
	 * @param start - The beginning of the array excluding the pivot.
	 * @param end - The end of the array excluding the pivot.
	 * @return i+1 - pivot value
	 */
	private static int partition (double []arr, int start, int end) {
		int i = start -1;
		for (int j = start; j < end; j++) {
			//rearrange smaller values to the left
			if (arr[j] < arr[end]) {
				i++;
				swap (arr, i, j);
			}
		}
		//places pivot in correct order within rearranged array 
		swap (arr, i+1, end);
		return i+1; //pivot value
	}

	//String quickSort
	/**
	 * Calls the quickSort method to sort the array using quick sort.
	 * @param arr - The double array reference.
	 * @return void
	 */
	public static void quickSort (String []arr) {
		quickSort (arr, 0, arr.length-1);
	}

	/**
	 * Pick a pivot value and partition the array so that larger are on the right and smaller are on the left to allow the pivot to be in the correct position in the array. Repeat with left side and right side.
	 * @param arr - The double array reference
	 * @param start - The beginning of the array excluding the pivot.
	 * @param end - The end of the array excluding the pivot.
	 * @return void
	 */
	private static void quickSort(String[]arr, int start, int end) {
		//when array length is 1 value
		if (end-start+1 == 0) {
			return;
		}
		else {
			int pivot = partition (arr, start, end);
			quickSort (arr, start, pivot-1); //left side
			quickSort (arr, pivot+1, end); //right side
		}
	}

	/**
	 * Values smaller than the pivot are placed to the left and values larger than the pivot are placed to the right.
	 * @param arr - The double array reference.
	 * @param start - The beginning of the array excluding the pivot.
	 * @param end - The end of the array excluding the pivot.
	 * @return i+1 - pivot value
	 */
	private static int partition (String []arr, int start, int end) {
		int i = start -1;
		for (int j = start; j < end; j++) {
			//rearrange smaller values to the left
			if (arr[j].compareTo(arr[end]) < 0) {
				i++;
				swap (arr, i, j);
			}
		}
		//places pivot in correct order within rearranged array 
		swap (arr, i+1, end);
		return i+1; //pivot value
	}

	public static void mergeSort (int []arr) {
		mergeSort (arr,0, arr.length);
	}

	private static void mergeSort (int []arr, int start, int end) {
		if (end-start+1==0) {
			return;
		}
		else {
			mergeSort (arr, start, end);
		}

	}


}
