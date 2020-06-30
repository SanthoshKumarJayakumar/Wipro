package Pattern;

import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		for (int i = n-1; i >= 0; i--) {  // i= 4 3 2 1 0
			int k=n-i;                    // 5-4=1 5-3=2 5-2=3 5-1=4 5-0=5
			for (int j = 0; j < i; j++) { //i= 4 3 2 1 0
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) { // j= 1 2 3 4 5
				System.out.print("*");
			}
			System.out.println();
		}d.close();
	}
}

