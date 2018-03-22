import java.util.Scanner;
public class FromPrefixToPostfix {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String prefix = sc.nextLine();
		
		System.out.println(toPostfix(prefix));
	}

	public static String toPostfix(String prefix) {
		String output = " ";
		if(Character.isDigit(prefix.charAt(0))) { 
			output = prefix.charAt(0) + "";
		}
		else{ 			
			output = toPostfix(prefix.substring(1,toPostfixHelp(prefix))) + toPostfix(prefix.substring(toPostfixHelp(prefix)))  + prefix.charAt(0);			
		}
		return output;
	}
	
	public static int toPostfixHelp(String prefix) {
		int numcounter = 0;
		int symcounter = 0;
		for (int i = 1; i < prefix.length(); i++) {
			if(Character.isDigit(prefix.charAt(i))) {
				numcounter++;
			}
			else {
				symcounter++;
			}
			if(numcounter > symcounter) {
				return i + 1;
			}
		}
		return 1;
	}
}
