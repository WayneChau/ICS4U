import java.util.Scanner;

public class RecursionExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//System.out.println(factorial(n));
		//System.out.println(sum(n));
		//System.out.println(exponent(a,b));
		//System.out.println(binToDec(n));
		System.out.println(decToBin(n));
	}

	private static int factorial (int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	private static int sum(int n) {
		if (n <=1 ) {
			return 1;
		}
		else {
			return n + sum (n-1);
		}
	}

	private static long exponent (int a, int b) {
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

	private static int binToDec (long n) {
		int counter = 0;
		int output = 0;

		return helperMethod(n,counter,output);

	}
	private static int helperMethod (long n, int counter, int output){
		output = 0;
		if (n%10 == 1) {
			output = (int) Math.pow(2, counter);

		}
		if (n==0) {
			return (int) n;
		}
		n=n/10;
		return output + helperMethod(n,counter+1,output);
	}

	private static long decToBin(int n) {
		String out = "";
		return helperMethod2(n, out);
	}

	private static long helperMethod2 (int n, String out) {

		
			if (n%2 == 1 && n >= 1) {
				out += 1;
				n = n/2;

			}
			else if (n%2 == 0 && n >= 1){
				out += 0;
				n = n/2;
			}
			if (n == 0) {
				return 0;
			}
		
		return Long.parseLong(out) + helperMethod2(n,out);


	}



}
