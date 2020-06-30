package HandsOnAssignment;

import java.util.Scanner;

public class FCSA15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number to count the Sum of all Digits:");
		int input1=d.nextInt();
        int sum = 0; 
        for (;input1!=0;) {
			sum += input1 % 10; 
            input1 /= 10; 
        } 
        System.out.println(sum);
        d.close();
	}

}
