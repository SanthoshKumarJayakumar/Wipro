package Pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		for (int i = n; i > 0; i--) {      // 5 4 3 2 1
			int k=n-i;                     // 5-5=0 5-4=1 5-3=2 5-2=3 5-1=4
			for (int j = 0; j < k; j++) {  
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}d.close();
	}
}
