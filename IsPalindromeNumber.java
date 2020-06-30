package Milestone;

import java.util.Scanner;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the number to check whether it is Palindrome or Not");
		int input1=d.nextInt();
		if(input1>=0 && input1<=25000){
		String s=String.valueOf(input1);
		StringBuilder sb = new StringBuilder(s);   
		sb=sb.reverse();
		String s2=sb.toString();
		if(s.equals(s2)){
			System.out.println(input1+" is Palindrome");
		}
		else {
			System.out.println(input1+" is Not a Palindrome");
		}
		}d.close();
	}
}
