package HandsOnAssignment;

import java.util.Scanner;

public class ArraysA03 {

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
		int index = -1;
		System.out.println("Enter the number to search in array:");
		int n1=d.nextInt();
		for (int i = 0; i < n; i++) {
			if(arr[i]==n1){
				index=i;
			}
		}
		if(index==-1){
			System.out.println(index);
		}
		else{
			System.out.println(index+1);
		}
		d.close();
	}

}
