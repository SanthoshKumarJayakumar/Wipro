package Sample;
import java.util.Scanner;
public class PrimeNumberStartingEndingCondition {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Starting Number:");
		int number=d.nextInt();
		System.out.println("Enter the Ending Number:");
		int n=d.nextInt();
		int i  ,count; 
		System.out.println("Prime Numbers from 1 to "+ n +" are : ");	
		for(; number <= n; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}d.close();
}
	

	
	
	
	
}
