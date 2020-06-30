package Sample;
import java.util.Scanner;
public class GenerateOneTimePassword {
	//61741978349
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Account Holder Name");
		String input1=d.next();
		System.out.println("Enter the Account Number");
		long input2=d.nextLong();
		System.out.println("Enter the Type of Account (Savings/Current/Loan)");
		String input3=d.next();
		String str = Long.toString(input2);
		String ch12="";
		int ch4=0;
		int ch6=0;
		char ch5='\0';
		char ch7='\0';
		String ch3="";
		String ch8="";
		String strs = Long.toString(input2);
		if((input3.equalsIgnoreCase("Savings") || input3.equalsIgnoreCase("Current") || input3.equalsIgnoreCase("Loan")) ) {
		ch12=input3.substring(0,2);
		for (int i = 0; i < 5; i++) {
			ch4 +=(Integer.parseInt( String.valueOf((strs.substring(0,5)).charAt(i))));		
		    while((String.valueOf(ch4)).length()!=1) {
				ch4 = ((ch4/10)+(ch4%10));
			}    
		}
		for (int i = 0; i < 5; i++) {
			ch6 +=(Integer.parseInt( String.valueOf((strs.substring(5,10)).charAt(i))));
			while((String.valueOf(ch6)).length()!=1) {
				ch6 = ((ch6/10)+(ch6%10));
			}
		}
		if(input1.length()>=2){
			ch5=input1.charAt(0);
			ch7=input1.charAt(input1.length()-1);
		}
		if(str.length()==11){
			ch3=str.substring(0, 1);
			ch8=str.substring(str.length()-1,str.length());
		}
		System.out.println(ch12+ch3+ch4+ch5+((int)(ch6/10)+(ch6%10))+ch7+ch8);
		}
		else{
			System.out.println("\n---Enter the Correct Details Again ! Invalid Data---\n");
			main(new String[] {});
		}d.close();
	}
}


