package Milestone2;

import java.util.Scanner;

public class EncryptionProblem_StringBased {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String strs=d.nextLine();
		if(strs.matches("^[a-zA-Z]*$")) { //Checks Whether Alphabet Only
			String str=strs.toLowerCase(); 
			char Och[]=strs.toCharArray(); //Original String Array
			char lastletter=str.charAt(str.length()-1);
			String s="abcdefghijklmnopqrstuvwxyz";
			int in=s.indexOf(lastletter)+1; //Index value of last Letter
			char[] ch=str.toCharArray(); //Lower Case String Array
			int[] res=new int[str.length()-1]; //Index Values of Array 
			String result="";
			for (int i = 0; i < ch.length-1; i++) {
				res[i]= (s.indexOf(ch[i])-in);
				if(res[i]<0) {
					res[i]+=26;
				}
				result+=s.charAt(res[i]);
			}
			result+=s.charAt(in-1);
			char CapToSmall[]=result.toCharArray();
			String j="";
			for (int i = 0; i < Och.length; i++) {
				if(Character.isUpperCase(Och[i])) {
					CapToSmall[i]=Character.toUpperCase(CapToSmall[i]);
					j+=CapToSmall[i];
				}
				else {
					j+=CapToSmall[i];
				}
			}
			System.out.println(j);
		}
		else {
			System.out.println("Enter Valid String");
			main(new String[] {});
		}
		d.close();
	}
}
