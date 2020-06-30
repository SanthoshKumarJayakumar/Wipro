package Milestone;

import java.util.Scanner;

public class SumOfEvenOrOddDigitsInN {
	public static void main(String [] args){
		int num1, rE,rO, sumE = 0, SumO=0 ;
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num1 = d.nextInt();
        int num2=num1;
        while (num1 > 0) {
            rE = num1 % 10;
            if (rE % 2 == 0) {
                sumE = sumE + rE;
            }
            num1 = num1 / 10;
            rO = num2 % 10;
            if(rO % 2 != 0) {
                SumO = SumO + rO;
            }
            num2 = num2 / 10;
        }
        System.out.println("\nEnter the Choice to Display Sum of \n1.Even\n2.Odd \n");
        int EO=d.nextInt();
        switch (EO){
        case 1:
        System.out.print("\nSum of Even Digits: " + sumE);
        break;
        case 2:
        System.out.print("\nSum of Odd Digits: " + SumO);
        break;
	}
        d.close();
        }
}

/*
int input21, rE,rO, sumE = 0, SumO=0 ;
input21=input1;
while (input1 > 0) {
    rE = input1 % 10;
    if (rE % 2 == 0) {
        sumE = sumE + rE;
    }
    input1 = input1 / 10;
    rO = input21 % 10;
    if(rO % 2 != 0) {
        SumO = SumO + rO;
    }
    input21 = input21 / 10;
}
switch (input2){
case "even":
	return sumE;
case "odd":
	return SumO;
}
return 0;
*/