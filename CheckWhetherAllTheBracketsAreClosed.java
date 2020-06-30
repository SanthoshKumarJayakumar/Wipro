package Sample;
import java.util.*;
public class CheckWhetherAllTheBracketsAreClosed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=d.nextLine();
		int c=0;
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		int index=0;
		String s1[] = new String[str.length()];
		for(int i=0;i<=str.length()-1;i++){
			s1[i]="0";
				if(str.charAt(i)=='(' || str.charAt(i)==')' || str.charAt(i)=='{' || str.charAt(i)=='}' || str.charAt(i)=='[' || str.charAt(i)==']'){
					s1[index]=String.valueOf(str.charAt(i));
					index++;
				}
		}	
		for (int i = 0; i <=s1.length-1; i++) {
			if(s1[i].equals("(")){
				c++;
			}
			else if(s1[i].equals(")")){
				c1=c1+1;
			}
			else if(s1[i].equals("{")){
				c2=c2+1;
			}
			else if(s1[i].equals("}")){
				c3=c3+1;
			}
			else if(s1[i].equals("[")){
				c4=c4+1;
			}
			if (s1[i].equals("]")){
				c5=c5+1;
			}		
		}
		if(c==c1 && c2==c3 && c4==c5){
			System.out.println("All Closed");
		}
		else{
			System.out.println("Not Closed");
		}d.close();
	}
}
