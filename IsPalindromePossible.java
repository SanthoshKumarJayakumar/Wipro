package Milestone;

import java.util.Scanner;

public class IsPalindromePossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number");
		int input1=d.nextInt();
		String s=String.valueOf(input1);
		char ch[]=s.toCharArray();
		int flag=0;
		int so=0;
		for (int i = 0; i <s.length(); i++) {
			for (int j = 1+i; j < s.length(); j++) {
				if(ch[i]==ch[j]){
					ch[j]=' ';
					flag=1;
				}
			}
			if(flag==1){
				ch[i]=' ';
				flag=0;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' '){
				so++;
			}
		}
		if(input1>=1 && input1<=25000){
			if(so>1){
				System.out.println("No");
			}
			else{
				System.out.println("yes");
			}
		}d.close();
	}
}
