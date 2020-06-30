package Sample;

import java.util.Scanner;

public class NIsPrimeOrNot {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=d.nextInt();
		int count=0;
		for (int i = 2; i <= n; i++){
		    	if(n % i == 0){
		    		count++;
		    	}
		   
		}
		if (count>1){
			System.out.println(n+" is Not a Prime Number");
		}
		else{
			System.out.println(n+" is a Prime Number");
		}d.close();
	}
}
