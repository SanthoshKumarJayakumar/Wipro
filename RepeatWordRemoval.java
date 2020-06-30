package Sample;

import java.util.Scanner;
// Input=apple Output=aple
public class RepeatWordRemoval {
	public static void main(String args[] ){
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=d.next();
		String s1="";
		char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++){
				if(!s1.contains(ch[i]+"")){
					s1+=ch[i];
				}
			}
			System.out.println(s1);
			d.close();	
		}
}
