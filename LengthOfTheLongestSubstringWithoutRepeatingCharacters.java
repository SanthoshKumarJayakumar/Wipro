package Milestone2;

import java.util.Scanner;

public class LengthOfTheLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=d.next();
		char ch[]=s.toCharArray();
		int len=0;
		for (int i = 0; i < ch.length; i++) {
			String temp=String.valueOf(ch[i]);			
			for (int j = i+1; j < ch.length; j++) {
				if(!temp.contains(ch[j]+"")){
					temp+=ch[j];
					if(temp.length()>len) {
						len=temp.length();
					}
				}
				else {
					if(temp.length()>len) {
						len=temp.length();
					}
					break;
				}
			}
		}		
		System.out.println(len);
		d.close();
	}
}