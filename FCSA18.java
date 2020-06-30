package HandsOnAssignment;

public class FCSA18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1=Integer.parseInt(args[0]);
		String s=String.valueOf(input1);
		StringBuilder sb = new StringBuilder(s);   
		sb=sb.reverse();
		String s2=sb.toString();
		if(s.equals(s2)){
			System.out.println(input1+" is Palindrome");
		}
		else {
			System.out.println(input1+" is not a Palindrome");
		}
	}

}
