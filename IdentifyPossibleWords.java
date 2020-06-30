package Milestone2;

import java.util.Scanner;

public class IdentifyPossibleWords {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		//System.out.println("Enter the String");
		String input1="Fi_er";
		String input2="Fever:filer:filter:Fixer:fiber:fibre:Tailor:offer";
		String res="";
		if(input1.matches("^[a-zA-Z_]*$") && input2.matches("^[a-zA-Z_:]*$")) { //Checks Whether Alphabet Only
			String str[]=input2.split(":");
			String ch[]=input1.split("_");
			for (int i = 0; i < str.length; i++) {
				if(str[i].toLowerCase().contains(ch[0].toLowerCase()) && str[i].toLowerCase().contains(ch[1].toLowerCase()) && str[i].length()==input1.length()) {
					res+=str[i].toUpperCase()+":";
				}
			}
			System.out.println("Result: "+res.substring(0,res.length()-1));
		}
		else {
			System.out.println("ERROR-009");

		}
	}

}
