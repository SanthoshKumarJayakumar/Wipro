package HandsOnAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysA06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=d.nextInt();
		int arr[] = new int[n];	
		System.out.println("Enter array Elements:");
		for (int i = 0; i < n; i++) {
			arr[i]=d.nextInt();
		}
		Arrays.sort(arr); 
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}d.close();
	}

}
