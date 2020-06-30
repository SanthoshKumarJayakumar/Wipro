package HandsOnAssignment;

import java.util.Scanner;

public class FCSA01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=d.nextInt();
		if(n==0){
			System.out.println("Zero");
		}
		if(n>0){
			System.out.println("Positive");
		}
		else if(n<0){
			System.out.println("Negative");
		}d.close();
	}

}
