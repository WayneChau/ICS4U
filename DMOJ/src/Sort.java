import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		//int [] arr = {1,8,3,19,7};
		//double [] arr = {3.4,78.9,17.9,32.3,2.4};
		String [] arr = {"Hello","Cat","Dog","Rat","Eagle"};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr [i] + " ");
		}
	}

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

	private static void swap (int [] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

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

	private static void swap (double [] arr, int index1, int index2) {
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

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

	public static void bubbleSort(int [] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=1; j < arr.length; j++) {
				if (arr[j] < arr[j-1]) {
					swap (arr, j, j-1);
				}
			}
		}

	}

	public static void bubbleSort(double [] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=1; j < arr.length; j++) {
				if (arr[j] < arr[j-1]) {
					swap (arr, j, j-1);
				}
			}
		}
	}

	public static void bubbleSort(String [] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[j-1]) < 0) {
					swap (arr, j, j-1);
				}
			}
		}
	}

	private static void swap (String [] arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
