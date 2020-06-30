package Milestone;

import java.util.Scanner;

public class SumOfAllDigitsInN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number to count the Sum of all Digits:");
		int n=d.nextInt();
		int input1 = Math.abs(n);
        int sum = 0; 
        while (input1 > 0 || sum > 9)  
        { 
            if (input1 == 0) { 
                input1 = sum;     
                sum = 0; 
            } 
            sum += input1 % 10; 
            input1 /= 10; 
        } 
        if(n<0){
        	System.out.println(sum*-1);
        }
        else{
        	System.out.println(sum);
        }
        d.close();
    } 
}


