import java.util.Scanner;
/**
 * RecursionExamples.java
 * Solving different programs using recursive methods.
 * March 5th, 2018
 * @author WayneChau
 */

public class RecursionExamples {

	/**
	 * Tests if the method works by printing the answers derived from the recursive methods.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//System.out.println(factorial(n));
		//System.out.println(sum(n));
		//System.out.println(exponent(a,b));
		//System.out.println(binToDec(n));
		//System.out.println(decToBin(n));
	}
	
	/**
	 * Calculates the factorial of the integer, inputed by the user.
	 * @param n - The number inputed by the user.
	 * @return The factorial of n
	 */
	public static int factorial (int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	/**
	 * Calculates the sum of the integer between 0 and n, inputed by the user .
	 * @param n - The number inputed by the user.
	 * @return returns the sum of all numbers between 0 and n
	 */
	public static int sum(int n) {
		if (n <=1 ) {
			return 1;
		}
		else {
			return n + sum (n-1);
		}
	}
	
	/**
	 * Calculate the result of a number raised to the power of another number entered by the user.
	 * @param a - The base of the exponent.
	 * @param b - The exponent a is raised to the power of.
	 * @return returns the result of a raised to the power of b.
	 */
	public static long exponent (int a, int b) {
		if (b==1) {
			return a;
		}
		else if (b==0) {
			return 1;
		}
		else {
			return a * exponent (a,b-1);
		}
	}

	/**
	 * Passes the decimal value equivalent to the binary.
	 * @param n - The binary inputed by the user.
	 * @return returns the decimal equivalent to the binary called from binToDecHelp.
	 */
	public static int binToDec (long n) {
		int counter = 0; //exponent to raise to the power of the base 2
		int output = 0; //the decimal value equivalent to binary

		return binToDecHelp(n,counter,output);

	}
	
	/**
	 * Calculates the decimal value equivalent to binary.
	 * @param n - The number inputed by the user.
	 * @param counter - The exponent the base two is raised to the power of.
	 * @param output - The decimal answer of the binary n.
	 * @return returns the decimal equivalent to the binary
	 */
	private static int binToDecHelp (long n, int counter, int output){
		output = 0;
		if (n%10 == 1) {
			output = (int) Math.pow(2, counter);

		}
		if (n==0) {
			return (int) n; //base case
		}
		n=n/10;
		return output + binToDecHelp(n,counter+1,output);
	}
	
	/**
	 * Calculates the binary equivalent to the decimal value.
	 * @param n - The number inputed by the user.
	 * @return returns the binary equivalent to the given decimal number n
	 */
	public static long decToBin(int n) {
		String out = "";
		if (n>0) {
			 
			out += n%2 + ""; //returns 1 or 0 depending on the remainders
			n = n/2;
			
		}
		else if (n==0){
			return n; //base case
		}             
		return Long.parseLong(decToBin(n)+out);
	}
}
