package Sample;

import java.util.Scanner;
// Input=apple Output=ale
public class RepeatedWordRemoval {
	public static void main(String args[] ){
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=d.next();
		String s1="";
		char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++){
				if(!s1.contains(String.valueOf(ch[i]))){
					s1+=ch[i];

				}else{
					s1=s1.replace(String.valueOf(ch[i]),"");
				}
			}
		System.out.println(s1);
		d.close();

	}
}