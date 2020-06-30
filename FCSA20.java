package HandsOnAssignment;

import java.util.Scanner;

public class FCSA20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char enter='n';
		do {
			System.out.println("1.Add");
			System.out.println("2.Sub");
			int option=scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the two number: ");
				int a=scan.nextInt();
				int b=scan.nextInt();
				System.out.println("Addition: "+(a+b));
				break;
			case 2:
				System.out.println("Enter the two number: ");
				int c=scan.nextInt();
				int d=scan.nextInt();
				System.out.println("Addition: "+(c-d));
				break;
			default:
				System.out.println("Enter the given option.....");
				break;
			}
			System.out.println("Do u want to continue press Y or y.....");
			enter=scan.next().charAt(0);
			} while (enter=='y'||enter=='Y');
		scan.close();
	}

}
