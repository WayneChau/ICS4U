import java.util.Scanner;
/**
 * Searches for the target number within the sorted array using different method of searches.
 * April 4th, 2018
 * @author WayneChau
 */
public class Search {

	/**
	 * Tests if the methods work by printing the position within the array where the target number is found from the searching methods.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int []arr = {2,4,6,7,8,10,11,16,20,21,24,25,29};
		double [] arr = {3.4,17.9,32.3,78.9};
		//String [] arr = {"Apple","Cat","Dog","Eagle","Zed"};
		//System.out.println(binarySearch (arr, 4));
		System.out.println(binarySearch (arr, 17.9));
		//System.out.println(binarySearch (arr, "Eagle"));
	}

	/**
	 * Searches the array values from the beginning and the next one to the right until the key position is located.
	 * @param arr -The int array that will be searched.
	 * @param key - The key to be searched for.
	 * @return i - The position within the array where the target number is found.
	 * @return -1 - When the key does not exist in the array.
	 */
	public static int linearSearch(int[] arr, int key) {
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Searches the array values from the beginning and the next one to the right until the key position is located.
	 * @param arr -The double array that will be searched.
	 * @param key - The key to be searched for.
	 * @return i - The position within the array where the target number is found.
	 * @return -1 - When the key does not exist in the array.
	 */
	public static int linearSearch(double[] arr, double key) {
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Searches the array values from the beginning and the next one to the right, comparing it with the key until the key position is located.
	 * @param arr -The String array that will be searched.
	 * @param key - The key to be searched for.
	 * @return i - The position within the array where the target number is found.
	 * @return -1 - When the key does not exist in the array.
	 */
	public static int linearSearch(String[] arr, String key) {
		for (int i=0; i < arr.length; i++) {
			if (arr[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Calls the binarySearch method to search the key value using binary search.
	 * @param arr - The int array that will be searched.
	 * @param key - The key to be searched for.
	 * @return The position within the array where the target number is found.
	 */
	public static int binarySearch(int[] arr, int key) {
		return binarySearch (arr, key, 0, arr.length-1);
	}

	/**
	 * Compares the mid element, moving left if the desired element is less than the middle or moving right if the desired element is greater than the middle.
	 * @param arr - The int array that will be searched.
	 * @param key - The key to be searched for.
	 * @param start - The position of the beginning value of the array that will be searched.
	 * @param end - The position of the last value of the array that will be searched.
	 * @return mid - The position within the array where the target number is found.
	 * @return -1 - When the key does not exist in the array.
	 */
	private static int binarySearch(int[] arr, int key, int start, int end) {
		int mid = (start+end)/2;
		if (start-end==1) {
			return -1;
		}
		else if (arr[mid] == key) {
			return mid;
		}
		else if (arr[mid] > key) {
			return binarySearch (arr, key, start, mid-1);
		}
		else if (arr[mid] < key) {
			return binarySearch (arr, key, mid+1, end);
		}
		return -1;
	}
	
	/**
	 * Calls the binarySearch method to search the key value using binary search.
	 * @param arr - The double array that will be searched.
	 * @param key - The key to be searched for.
	 * @return The position within the array where the target number is found.
	 */
	public static int binarySearch(double[] arr, double key) {
		return binarySearch (arr, key, 0, arr.length-1);
	}

	/**
	 * Compares the mid element, moving left if the desired element is less than the middle or moving right if the desired element is greater than the middle.
	 * @param arr - The double array that will be searched.
	 * @param key - The key to be searched for.
	 * @param start - The position of the beginning value of the array that will be searched.
	 * @param end - The position of the last value of the array that will be searched.
	 * @return mid - The position within the array where the target number is found.
	 * @return -1 - When the key does not exist in the array.
	 */
	private static int binarySearch(double[] arr, double key, int start, int end) {
		int mid = (start+end)/2;
		if (start-end==1) {
			return -1;
		}
		else if (arr[mid] == key) {
			return mid;
		}
		else if (arr[mid] > key) {
			return binarySearch (arr, key, start, mid-1);
		}
		else if (arr[mid] < key) {
			return binarySearch (arr, key, mid+1, end);
		}
		return -1;
	}
	
	/**
	 * Calls the binarySearch method to search the key value using binary search.
	 * @param arr - The String array that will be searched.
	 * @param key - The key to be searched for.
	 * @return The position within the array where the target number is found.
	 */
	public static int binarySearch(String[] arr, String key) {
		return binarySearch (arr, key, 0, arr.length-1);
	}
	
	/**
	 * Compares the mid element, moving left if the desired element is less than the middle or moving right if the desired element is greater than the middle.
	 * @param arr - The String array that will be searched.
	 * @param key - The key to be searched for.
	 * @param start - The position of the beginning value of the array that will be searched.
	 * @param end - The position of the last value of the array that will be searched.
	 * @return mid - The position within the array where the target number is found.
	 * @return -1 - When the key does not exist in the array.
	 */
	private static int binarySearch(String[] arr, String key, int start, int end) {
		int mid = (start+end)/2;
		if (start-end==1) {
			return -1;
		}
		else if (arr[mid].compareTo(key) == 0) {
			return mid;
		}
		else if (arr[mid].compareTo(key) > 0) {
			return binarySearch (arr, key, start, mid-1);
		}
		else if (arr[mid].compareTo(key) < 0) {
			return binarySearch (arr, key, mid+1, end);
		}
		return -1;
	}

}
