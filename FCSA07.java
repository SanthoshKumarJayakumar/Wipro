package HandsOnAssignment;

import java.util.Scanner;

public class FCSA07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner (System.in);
		System.out.println("Enter the Character:");
		char c=d.next().charAt(0);
		String a=String.valueOf(c);
		int n=c;
		if(n>=65 && n<=90){	
			System.out.println(c+"->"+a.toLowerCase());
		}
		else if(n>=97 && n<=122){
			System.out.println(c+"->"+a.toUpperCase());
		}d.close();
	}

}
