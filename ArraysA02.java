package HandsOnAssignment;

import java.util.Scanner;

public class ArraysA02 {

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
		int max = arr[0],min = arr[0];
		for (int i = 0; i < n; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Maximum Value in Array: "+max);
		System.out.println("Minimum Value in Array: "+min);
		d.close();
	}

}
