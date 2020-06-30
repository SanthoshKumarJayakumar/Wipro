package HandsOnAssignment;

import java.util.Scanner;

public class FCSA08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Code R/B/G/O/Y/W");
		char ch=d.next().charAt(0);
		switch(ch){
		case 'R':
			System.out.println(ch+"->"+"Red");
			break;
		case 'B':
			System.out.println(ch+"->"+"Blue");
			break;
		case 'G':
			System.out.println(ch+"->"+"Green");
			break;
		case 'O':
			System.out.println(ch+"->"+"Orange");
			break;
		case 'Y':
			System.out.println(ch+"->"+"Yellow");
			break;
		case 'W':
			System.out.println(ch+"->"+"White");
			break;
		default:
			System.out.println("Invalid Code");
		}d.close();
	}

}
