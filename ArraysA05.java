package HandsOnAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysA05 {

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
		System.out.println("Minimum Number: "+"1st-->"+arr[0]+" "+"2nd-->"+arr[1]);
		System.out.println("Maximum Number: "+"1st-->"+arr[n-1]+" "+"2nd-->"+arr[n-2]);
		d.close();
	}

}
