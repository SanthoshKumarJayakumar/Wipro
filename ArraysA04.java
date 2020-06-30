package HandsOnAssignment;

import java.util.Scanner;

public class ArraysA04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=d.nextInt();
		int arr[] = new int[n];	
		char ch[] = new char[n];
		System.out.println("Enter array Elements:");
		for (int i = 0; i < n; i++) {
			arr[i]=d.nextInt();
		}
		for (int i = 0; i < n; i++) {
			ch[i] = (char) arr[i];
			System.out.println(ch[i]);
		}d.close();
	}

}
