package Sample;
import java.util.*;
public class Watermelon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Weight");
		int w=d.nextInt();
		if((w>=1 && w<=100)){
			if(w%2==0 && w!=2){
				System.out.println("YES");
				if(((w/2)%2)==0){
					System.out.println((w/2)+" "+(w/2));
				}
				else{
				System.out.println((w/2)-1+" "+((w/2)+1));
				}
			}
			else{
				System.out.println("NO");
			}
		}
		else{
		System.out.println("Invalid Input");
		}d.close();
	}
}
