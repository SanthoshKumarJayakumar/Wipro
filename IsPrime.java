package Milestone;
/* Write a function that finds whether the given number N is Prime or not.
 * if the number is prime, the function should return 2 else it must return 1.
		Assumption: 2<=N<=5000, where N is given number */

public class IsPrime {
	public int isPrime(int input1){
		int count=0;
		if(input1>=2 && input1<=5000){
		    for (int i = 2; i <= input1/2; i++)
		    {
		    	if(input1 % i == 0)
		    	{
					count++;
		    	}
				return 2;
		    }
		    
		}
		if(count !=0){
			return 1;
		}
		return 2;
	}

}
