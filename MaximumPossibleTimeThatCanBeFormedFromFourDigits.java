package Sample;
import java.util.Scanner;
public class MaximumPossibleTimeThatCanBeFormedFromFourDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int arr[]=new int[4];
		System.out.println("Enter the Array Elements");
		int max=0;
		int max1=0;
		for (int i = 0; i < 4; i++) {
			arr[i]=d.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0 && arr[i]<3){
				max=arr[i];
				if(arr[i]>max && max<3 && max>=0){
					max=arr[i];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0 && arr[i]<10){
				max1 = arr[i];
				if(arr[i]>max1 && max1<10 && max1>=0){
					max1=arr[i];
				}
			}
		}
		System.out.println(max);
		System.out.println(max1);
		d.close();

	}

}
