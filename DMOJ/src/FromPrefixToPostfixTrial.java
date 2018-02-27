import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FromPrefixToPostfixTrial {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner (System.in);
		String answer = "";
		System.out.println("Enter the arithmetic prefix expression -> ");
		String number = sc.nextLine();
	
		answer += getNumber2(number, number);
		answer.replaceAll(" ", "");
		System.out.println(answer);


	}

	public static String getNumber2(String c, String count) throws Exception {
		String output = "";
		String symbol = "";
		String store = "";
		for(int i = 0; i < count.length(); i++) {
			if (c.charAt(i) != '+' && c.charAt(i) != '-' && c.charAt(i) != ' ') {
				output += c.charAt(i);
			}
			else if ( c == "0"){

			}
			else if (c.charAt(i) == '+' || c.charAt(i) == '-') {
				if(i == 0) {
					store += c.charAt(i);
				}
				else {
					symbol += c.charAt(i);
				}
			}
		}
		return output + symbol + store;
	}

	 
}