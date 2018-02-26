import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		char src = 'A';
		char aux = 'B';
		char dst = 'C';
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of disks for the Tower of Hanoi.");
		int n = sc.nextInt();
		solveRecursion(n, src, aux, dst);
		
	}
		public static void solveRecursion (int n, char src, char aux, char dst) {
			if (n == 0) {
				return;
			}
			else {
				solveRecursion (n-1, src, dst, aux);
				System.out.println("Move from " + src + " to " + dst + ".");
				solveRecursion (n-1, aux, src, dst);
				
			}
			
		}

	}


