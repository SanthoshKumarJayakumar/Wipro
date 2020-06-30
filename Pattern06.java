package Pattern;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		int k=(2*n)-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			k=k-2;
			System.out.println();
		}d.close();
	}
}
