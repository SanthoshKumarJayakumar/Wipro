package Milestone2;

import java.util.Scanner;

public class CheckWhetherTwoStringsContainSameCharactersInSameOrder {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=d.next();
		String str2=d.next();
		String arr[]= {str1,str2};
		String res[]= {"",""};
		for(int i=0;i<arr.length;i++){
			for (int j = 0; j < res.length; j++) {
				char ch[]=arr[i].toCharArray();
				for (int k = 0; k < ch.length; k++) {
					if(!res[j].contains(ch[k]+"")){
						res[j]+=ch[k];
					}
				}	
			}
		}
		System.out.println(res[0].equals(res[1]));
		d.close();	
	}
}
