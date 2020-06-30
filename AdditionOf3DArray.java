package Milestone2;

import java.util.Scanner;

public class AdditionOf3DArray {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Array times");
		int i=d.nextInt();
		System.out.println("Array row");
		int j=d.nextInt();
		System.out.println("Array col");
		int k=d.nextInt();
		int arr1[][][]=new int[i][j][k];
		int arr2[][][]=new int[i][j][k];
		int res[][][]=new int[i][j][k];
		System.out.println("Enter "+(i*j*k)+" Array Elements");
		for (int l1 = 0; l1 < i; l1++) {
			for (int l2 = 0; l2 < j; l2++) {
				for (int l3 = 0; l3 < k; l3++) {
					arr1[l1][l2][l3]=d.nextInt();
					arr2[l1][l2][l3]=d.nextInt();
					res[l1][l2][l3]=arr1[l1][l2][l3]+arr2[l1][l2][l3];
				}
			}
		}	
		for (int l1 = 0; l1 < i; l1++) {
			for (int l2 = 0; l2 < j; l2++) {
				for (int l3 = 0; l3 < k; l3++) {
					System.out.print(res[l1][l2][l3]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}d.close();
	}
}
