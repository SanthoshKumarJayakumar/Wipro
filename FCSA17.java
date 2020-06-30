package HandsOnAssignment;

import java.util.Scanner;

public class FCSA17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number to Reverse:");
		int n=d.nextInt();
		int r=0;
		int rev=0;
		while(n!=0){
			r=n%10;
			rev = rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
		d.close();
	}

}
