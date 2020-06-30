package Milestone2;

import java.util.Scanner;

public class FullPyramid {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			int k=n-i+1;
			for (int j = 0; j < k; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
