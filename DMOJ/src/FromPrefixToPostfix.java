import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FromPrefixToPostfix {
	static int counterNum = 0;
	static int counterSym = 0;

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner (System.in);
		String answer = "";
		System.out.println("Enter the arithmetic prefix expression -> ");
		String number = sc.nextLine();

		while (number != "0"){
			answer += postfix(number);
			answer.replaceAll(" ", "");
			System.out.println(answer);
			number = sc.nextLine();
		}
	}
	public static int helperMethod (String c) throws Exception{
		
		for(int i = 1; i < c.length(); i++) {
			if (counterNum > counterSym) {
			}
			else if(c.charAt(i) != '+' && c.charAt(i) != '-' && c.charAt(i) != ' ') {
				counterNum++;
			}
			else {
				counterSym++;
			}
		}
		return counterNum + 1;
	}

	public static String postfix(String c) throws Exception{
		String o = "";
		String opd1 = "";
		String opd2 = "";

		if (c.charAt(0) != '+' && c.charAt(0) != '-' && c.charAt(0) != ' ') {
			o += c.charAt(0);
		}
		else if (c.charAt(0) == '+' || c.charAt(0) == '-') {
			opd1 = postfix(c.substring(1,helperMethod(c)));
			opd2 = postfix(c.substring(helperMethod(c),c.length()));
			o += opd1 + opd2 + c.charAt(0);
		}
		return o;
	}
}








