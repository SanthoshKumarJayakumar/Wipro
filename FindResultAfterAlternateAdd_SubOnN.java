package Milestone2;

public class FindResultAfterAlternateAdd_SubOnN {
	public static void main(String[] args) {
		int input1=10000; //even or odd
		int input2=1; //2;
		int sum=input1;
		int arr[]=new int[input1];
		if(input1>=1 && input1<=10000){
			for (int i = input1,j=0; i > 0; i--,j++) {
				arr[j]=i;
				//System.out.println(arr[j]);
			}
			if(input2==1) { //input==1
				if(input1%2==1) {
					for (int i = 1; i < arr.length; i++) {
						if(i%2==0) {
							sum+=arr[i];
						}
						else {
							sum-=arr[i];
						}
					}
					}
				else {
					for (int i = 0; i < arr.length; i++) {
						if(i%2==0) {
							sum-=arr[i];
						}
						else {
							sum+=arr[i];
						}
					}						
				}
			}
			else { //input==2
				if(input1%2==1) { //if input2 is odd
					for (int i = 1; i < arr.length; i++) {
						if(i%2==0) {
							sum-=arr[i];
						}
						else {
							sum+=arr[i];
						}
					}
				}
				else { //if input2 is even
					for (int i = 0; i < arr.length; i++) {
						if(i%2==0) {
							sum+=arr[i];
						}
						else {
							sum-=arr[i];
						}
					}						
				}
			}
		System.out.println(sum);
		}
	}
}