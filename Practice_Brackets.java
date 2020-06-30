package Sample;
import java.util.*;
public class Practice_Brackets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=d.nextLine();
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
			if(s1[i].equals(s1[i].length()-1)){
				System.out.println(s1[i]);
			}
			
	
	}d.close();
}}
