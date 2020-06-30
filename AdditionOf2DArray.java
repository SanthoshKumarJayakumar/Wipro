package Milestone2;

import java.util.Scanner;

public class AdditionOf2DArray {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Array row");
		int i=d.nextInt();
		System.out.println("Array Col");
		int j=d.nextInt();
		int arr1[][]=new int[i][j];
		int arr2[][]=new int[i][j];
		int res[][]=new int[i][j];
		for (int k1 = 0; k1 < i; k1++) {
			for (int k2 = 0; k2 < j; k2++) {
				arr1[k1][k2]=d.nextInt();
				arr2[k1][k2]=d.nextInt();
			}
		}
		for (int k = 0; k < arr1.length; k++) {
			for (int k2 = 0; k2 < arr2.length; k2++) {
				res[k][k2]=arr1[k][k2]+arr2[k][k2];
			}
		}
		for (int k = 0; k < arr1.length; k++) {
			for (int k2 = 0; k2 < arr2.length; k2++) {
				System.out.print(res[k][k2]+" ");
			}
			System.out.println();
		}
		d.close();
	}
}
