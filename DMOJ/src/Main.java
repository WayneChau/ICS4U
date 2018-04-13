import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int y = sc.nextInt();
		int [][]x = new int [y][y];
		int d = y;
		d *= d;
		int z;
		for(int j=0; j < y; j++) {
				for(int i=0; i < y; i++) {
					while (d>y) {
					z = sc.nextInt();
					x[i][j] = z; 
					System.out.print(x[i][j] + " ");
					d--;
					}
					

				}
		}
	}
}
