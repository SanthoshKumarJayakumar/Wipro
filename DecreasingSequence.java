package Milestone2;

public class DecreasingSequence {

	public static void main(String[] args) {
		int arr[]= {11,3,1,4,7,8,12,2,3,7}; // 2 3
		//int arr[]= {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5}; // 3 6
		//int arr[]= {9}; // 1 0 0
		int count=0;
		int len=0;
		int l[];
		int temp[];
		for (int i = 1; i < arr.length; i++) {
			int in=arr[0];
			if(in>arr[i]) {
				in=arr[i];
				len+=2;
			}
			else {
				count+=1;
				System.out.println(count);
				in=arr[i];	
				count=0;
			}
		}
	}
}
