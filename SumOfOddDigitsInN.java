package Milestone;

import java.util.Scanner;

public class SumOfOddDigitsInN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, r, sum = 0;
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = d.nextInt();
        while (num > 0) {
            r = num % 10;
            if (r % 2 != 0) {
                sum = sum + r;
            }
            num = num / 10;
        }    
        System.out.print("\nSum of Odd Digits :" + sum);
        d.close();
	}

}
