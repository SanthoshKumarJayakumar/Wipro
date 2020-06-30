package Sample;
import java.util.Scanner;

// Program to display Vowels & Consonants in Lower & Upper Case & other characters

public class VowelsAndConstants {
	public static void main(String [] args){
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=d.next();
		String vowels="",cost="",emp="";
		for(int i=0;i<str.length();i++){
			 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {	
				vowels=vowels+str.charAt(i);
			 }
			 if ((Character.isAlphabetic(str.charAt(i))) && (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U')){	
					cost=cost+str.charAt(i);
			 }
			 else if(!(Character.isAlphabetic(str.charAt(i)))){
				 emp+=str.charAt(i);
				
			 }
		}
		
		System.out.println("\nVowels = "+vowels);
		System.out.println("Consonants = "+cost);
		System.out.println("Invalid Characters = "+emp);
		System.out.println("\nEnter the Choice\n1. Upper Case\n2. Lower Case");
		int n=d.nextInt();
		switch(n){
		case 1:
			System.out.println("\nVowels = "+vowels.toUpperCase());
			System.out.println("Consonants = "+cost.toUpperCase());
			System.out.println("Invalid Characters = "+emp);
			break;
		case 2:
			System.out.println("Vowels = "+vowels.toLowerCase());
			System.out.println("Consonants = "+cost.toLowerCase());
			System.out.println("Invalid Characters = "+emp);
			break;
		}
		/*if(emp==""){
			 System.out.println("Invalid Characters = There is no invalid characters");
		 } */
		d.close();
	}
}
