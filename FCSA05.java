package HandsOnAssignment;

import java.util.Scanner;

public class FCSA05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char c=d.next().charAt(0);
		if(Character.isAlphabetic(c)){
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(c)){
			System.out.println("Digit");
		}
		else{
			System.out.println("Special Characters");
		}d.close();
	}

}
