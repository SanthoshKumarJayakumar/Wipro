package Sample;
import java.util.ArrayList;
import java.util.Scanner;
/* 123
 * 345
 * 348
 * 899 or 999 3-4times 9-3times
 */
public class FindTheMaximumRepeatedNumbers {
	public static void main(String [] args){
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=d.nextInt();
		int str[]=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++){
			str[i]=d.nextInt();
			//System.out.println("Array Elements at position "+i+" is "+str[i]);
			for(int j=0;j<size;j++){
			int strs[]=new int[size];
				strs[i]=str[i]%10;
				str[i]=str[i]/10;
				//int input[]=new int[size];
				//input[i]=str[i];
				ArrayList<Integer> arr = new ArrayList<Integer>(100);
				if(strs != null){
					arr.add(strs[i]);
				}
				System.out.println(arr);
			}
			}
		d.close();
		
		//System.out.println("Array Elements at position "+i+" is "+str[i]);
		}
		
		
}


