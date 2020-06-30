package HandsOnAssignment;

import java.util.Scanner;

public class FCSA02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		if(n%2==0){
			System.out.println("Even");
		}
		else if(n%2!=0){
		System.out.println("Odd");
		}d.close();
	}

}
