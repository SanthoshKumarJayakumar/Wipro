package Milestone;
import java.util.Scanner;
public class AllDigitsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=d.nextInt();
		String s=String.valueOf(n);
		System.out.println(s.length());
		d.close();
	}
}
