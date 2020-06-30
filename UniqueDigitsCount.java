package Milestone;

import java.util.Scanner;

public class UniqueDigitsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Input to Count the Unique Digits:");
		int input1=d.nextInt();
		String s=String.valueOf(input1);
		char ch[]=s.toCharArray();
	    String s1="";
	    for(int i=0;i<s.length();i++){
			if(!s1.contains(ch[i]+"")){
				s1+=ch[i];
			}
		}
	    if(input1>=1 && input1<=25000){
		System.out.println(s1.length());
	}
	    d.close();}

}
