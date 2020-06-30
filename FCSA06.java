package HandsOnAssignment;

public class FCSA06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g=args[0];
		int age=Integer.parseInt(args[1]);
		if(g.equals("Male") && age>=1 && age <=60){
			System.out.println("Interest == 9.2%");
		}
		if(g.equals("Male") && age>=61 && age <=120){
			System.out.println("Interest == 8.3%");
		}
		if(g.equals("Female") && age>=1 && age <=58){
			System.out.println("Interest == 8.2%");
		}
		if(g.equals("Female") && age>=59 && age <=120){
			System.out.println("Interest == 7.6%");
		}
	}

}
