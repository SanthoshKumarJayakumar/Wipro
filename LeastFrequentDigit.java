package Milestone2;

import java.util.Arrays;

public class LeastFrequentDigit {

	public static void main(String[] args) {
		int input1[]= {1236,262,666,121};
		String str="";
		for(int i=0;i<input1.length;i++){
			str+=String.valueOf(input1[i]);
		}
		int C0=0,C1=0,C2=0,C3=0,C4=0,C5=0,C6=0,C7=0,C8=0,C9=0, sum = 0;
		for (int j = 0; j < str.length(); j++) {
			if(str.charAt(j)=='0') {
				C0++;
			}
			if(str.charAt(j)=='1') {
				C1++;
			}
			if(str.charAt(j)=='2') {
				C2++;
			}
			if(str.charAt(j)=='3') {
				C3++;

			}
			if(str.charAt(j)=='4') {
				C4++;
			}
			if(str.charAt(j)=='5') {
				C5++;
			}
			if(str.charAt(j)=='6') {
				C6++;
			}
			if(str.charAt(j)=='7') {
				C7++;
			}
			if(str.charAt(j)=='8') {
				C8++;
			}
			if(str.charAt(j)=='9') {
				C9++;
			}
		}
		int arr[]= {C0,C1,C2,C3,C4,C5,C6,C7,C8,C9};
		int arrs[]= {C0,C1,C2,C3,C4,C5,C6,C7,C8,C9};
		int num[]= {0,1,2,3,4,5,6,7,8,9};
		Arrays.sort(arr);
		int min = arr[arr.length-1];
		for(int i=0;i<arr.length;i++){
			if(arr[i] <= min && arr[i]!=0){
			  min = arr[i];
			}
		}
		System.out.println("Min-->"+min);
		for (int i = 0; i < arr.length; i++) {
			if(arrs[i]==min) {
				sum+=num[i];
			}
		}
		System.out.println("Sum-->"+sum);
	}
}