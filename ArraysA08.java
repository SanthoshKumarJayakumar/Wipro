package HandsOnAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysA08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=d.nextInt();
		int arr[] = new int[n];	
		int max_count = 1, res = arr[0] , curr_count = 1;
		System.out.println("Enter array Elements:");
		for (int i = 0; i < n; i++) {
			arr[i]=d.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
        // If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
        //System.out.println(max_count);
        d.close();
        System.out.println("The element of an array that has occurred the highest number of times is "+res); 
    } 
		
}


