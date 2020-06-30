package HandsOnAssignment;

import java.util.Scanner;

public class FCSA12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		int count=1;
		for (int i = 2; i < n/2; i++) {
			if(n%i==0){
				count++;
			}
		}
		if(count>=2){
			System.out.println(n+" is not a Prime Number");
		}
		else{
			System.out.println(n+" is a Prime Number");
		}
		d.close();
	}

}
