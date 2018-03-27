import java.util.Scanner;
/**
 * Sort.java
 * Sorting different types of values using various sorting algorithms.
 * March 25th, 2018
 * @author WayneChau
 */

/**
 * Sort.java
 * Sorting ints, doubles, and strings using different sorting methods in an order.
 * March 22nd, 2018
 * @author WayneChau
 */
public class Sort {
	
	/**
<<<<<<< HEAD
	 * Tests if the method works by printing the list derived from the sorting methods.
=======
	 * Tests if the methods work by printing the answers derived from the sorting methods.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		//int [] arr = {1,8,3,19,7};
		//double [] arr = {3.4,78.9,17.9,32.3,2.4};
		//String [] arr = {"Hello","Cat","Dog","Rat","Eagle"};
<<<<<<< HEAD
		//selectionSort(arr);
		//insertionSort(arr);
		//bubbleSort(arr);
		//for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr [i] + " ");
		//}
=======
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr [i] + " ");
		}
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
	}
<<<<<<< HEAD
	
	/**
	 * Selects the first value in the array and swaps it with the smallest value found in the array. It is repeated until all values are arranged in the correct order.
	 * @param arr - The int array inputed by the user.
=======

	/**
	 * Determines the smallest value in the array and swaps it with the first value. Repeats with the next value in the array until the array is rearranged correctly.
	 * @param arr - The int array
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * Swaps two int value from the array.
	 * @param arr - The int array.
	 * @param index1 - The position in the array to be switched.
	 * @param index2 - The position in the array to be switched.
=======
	 * Swaps one value with another value in the array.
	 * @param arr - The int array.
	 * @param index1 - The position of one value in the array.
	 * @param index2 - The position of the other value in the array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
	 */
	private static void swap (int [] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	/**
<<<<<<< HEAD
	 * Selects the first value in the array and swaps it with the smallest value found in the array. It is repeated until all values are arranged in the correct order.
	 * @param arr - The double array inputed by the user.
=======
	 * Determines the smallest value in the array and swaps it with the first value. Repeats with the next value in the array until the array is rearranged correctly.
	 * @param arr - The double array
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * Swaps two double value from the array.
	 * @param arr - The double array.
	 * @param index1 - The position in the array to be switched.
	 * @param index2 - The position in the array to be switched.
=======
	 * Swaps one value with another value in the array.
	 * @param arr - The double array.
	 * @param index1 - The position of one value in the array.
	 * @param index2 - The position of the other value in the array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
	 */
	private static void swap (double [] arr, int index1, int index2) {
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	/**
<<<<<<< HEAD
	 * Selects the first value in the array and swaps it with the smallest value found in the array. It is repeated until all values are arranged in the correct order.
	 * @param arr - The string array inputed by the user.
=======
	 * Determines the smallest value in the array and swaps it with the first value. Repeats with the next value in the array until the array is rearranged correctly.
	 * @param arr - The String array
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * Skips the first value and switch the next value with the value on the left if it is smaller until it is no longer smaller. It is repeated until all values are arranged in the correct order.
	 * @param arr - The int array inputed by the user.
=======
	 * Skips the first value considered as sub-sorted and starts with the second value. Place the value in the proper position moving sub-sorted list as necessary. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The int array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * Skips the first value and switch the next value with the value on the left if it is smaller until it is no longer smaller. It is repeated until all values are arranged in the correct order.
	 * @param arr - The double array inputed by the user.
=======
	 * Skips the first value considered as sub-sorted and starts with the second value. Place the value in the proper position moving sub-sorted list as necessary. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The double array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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

<<<<<<< HEAD
	
	/**
	 * Skips the first value and switch the next value with the value on the left if it is smaller until it is no longer smaller. It is repeated until all values are arranged in the correct order.
	 * @param arr - The string array inputed by the user.
=======
	/**
	 * Skips the first value considered as sub-sorted and starts with the second value. Place the value in the proper position moving sub-sorted list as necessary. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The String array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * 
	 * @param arr - The int array inputed by the user.
=======
	 * Compares the first value with the value on the right. The highest value is swapped to the highest position in the array. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The int array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * 
	 * @param arr - The double array inputed by the user.
=======
	 * Compares the first value with the value on the right. The highest value is swapped to the highest position in the array. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The double array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * 
	 * @param arr - The string array inputed by the user.
=======
	 * Compares the first value with the value on the right. The highest value is swapped to the highest position in the array. Repeats with the next value until the array is rearranged correctly.
	 * @param arr - The String array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
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
<<<<<<< HEAD
	 * Swaps two string value from the array.
	 * @param arr - The string array.
	 * @param index1 - The position in the array to be switched.
	 * @param index2 - The position in the array to be switched.
=======
	 * Swaps one value with another value in the array.
	 * @param arr - The String array.
	 * @param index1 - The position of one value in the array.
	 * @param index2 - The position of the other value in the array.
>>>>>>> branch 'master' of https://github.com/WayneChau/ICS4U.git
	 */
	private static void swap (String [] arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
