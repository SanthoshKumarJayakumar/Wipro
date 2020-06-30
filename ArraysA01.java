package HandsOnAssignment;

import java.util.Scanner;

public class ArraysA01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=d.nextInt();
		int arr[] = new int[n];
		int sum=0;
		System.out.println("Enter array Elements:");
		for (int i = 0; i < n; i++) {
			arr[i]=d.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("\nSum of the Array: "+sum);
		System.out.println("Average of Array: "+(float)sum/n);
		d.close();
	}

}
