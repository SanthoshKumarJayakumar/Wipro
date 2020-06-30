package Milestone2;

import java.util.Scanner;

public class GetCodeThroughStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		String input1=d.nextLine();
		String str[]=input1.split(" ");
		int sum=0;
		for(int i=0;i<str.length;i++){
			sum+=str[i].length();
		}
		System.out.println((sum%9==0)?9:(sum%9));
		d.close();
	}
}
