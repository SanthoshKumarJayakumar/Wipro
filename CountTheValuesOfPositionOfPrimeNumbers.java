package Sample;
import java.util.Scanner;
public class CountTheValuesOfPositionOfPrimeNumbers {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=d.nextInt();
		int input[]=new int[n];
		for (int i = 0; i < n; i++) {
			input[i]=d.nextInt();
		}
		int i , number = 0 ,count; 
		int pr[]=new int[n];
		int k=0;
		int zero =0;
		System.out.println("Prime Numbers from 1 to "+ n +" are : ");	
		for(number = 1; number <=n; number++){
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		
		    	}
		    	
		    }
		    if(count == 0 && number != 1 ){
		    	pr[k]=number;
		    	if(number!=0){
		    		zero++;
		    	}
		    	k++;
		    }
		}
		for (int j = 0; j <=n; j++) {
			System.out.println(input[pr[j]]+input[pr[j+1]]);

		}d.close();
	}  
}
		

	

	
	
	
	

