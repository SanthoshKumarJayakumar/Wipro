package HandsOnAssignment;

public class FCSA04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=args[0].charAt(0);
		char b=args[1].charAt(0);
		if(a<b){
			System.out.println(args[0]+","+args[1]);
		}
		else{
			System.out.println(args[1]+","+args[0]);
		}
	}

}
