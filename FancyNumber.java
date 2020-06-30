package Sample;
import java.util.Arrays;
import java.util.Scanner;
public class FancyNumber {
	public static void main(String [] args){
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Mobile Number:");
		String s=d.nextLine();
		String c="";
			for(int i=0;i<s.length()-2;i++){
				if( (s.charAt(i)) == (s.charAt(i+1))) {
					if(s.charAt(i+1) == s.charAt(i+2) ) {
						System.out.println("Given Number is Fancy");
						break;
					}
				}
				if( (s.charAt(i)) < (s.charAt(i+1)) && s.charAt(i)-s.charAt(i+1) == -1) {
					if(s.charAt(i+1) < s.charAt(i+2) && s.charAt(i+1)-s.charAt(i+2) == -1) {
						System.out.println("Given Number is Fancy");
						break;
					}
				}
				if( (s.charAt(i)) > (s.charAt(i+1)) && s.charAt(i)-s.charAt(i+1) == 1) {
					if(s.charAt(i+1) > s.charAt(i+2) && s.charAt(i+1)-s.charAt(i+2) == 1) {
						System.out.println("Given Number is Fancy");
						break;
					}
				}
				else{
					char ch[]=s.toCharArray();
					Arrays.sort(ch);
					c=new String(ch);
					if( (c.charAt(i)) == (c.charAt(i+1))) {
						if(c.charAt(i+1) == c.charAt(i+2) ) {
							System.out.println("Given Number is Fancy");
							break;
						}
					}
				}
				System.out.println("None of the given three conditions satisfy");
				break;
			
			}
			d.close();
	}
}
