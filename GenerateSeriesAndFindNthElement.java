package Milestone2;

public class GenerateSeriesAndFindNthElement {

	public static void main(String[] args) {
//		1,3,6,8,11,13,16,18,21,23,26,28,31,33,36,38,41		//17
//		5,-2,-4,-11,-13,-20,-22,-29,-31,-38,-40,-47,-49,-56		//15
		int input1=1;
		int input2=3;
		int input3=6;
		int input4=17; //even or odd
//		int input1=5;
//		int input2=-2;
//		int input3=-4;
//		int input4=12; //even or odd
		int temp=input4;
		if(temp%2==0) {
			temp=input4+1;
		}
		int arr[]=new int [temp];
		arr[0]=input1;
		arr[1]=input2;
		arr[2]=input3;
		if(input1>input2 && input2>input3) {
			int d1=input1-input2;
			int d2=input2-input3;
			for (int i = 3; i < arr.length-1; i=i+2) {
				if(arr[0]<0 || arr[1]<0 || arr[2]<0) {
					arr[i]=arr[i-1]-d1;
					arr[i+1]=arr[i]-d2;
				}
				else {
					arr[i]=arr[i-1]+d1;
					arr[i+1]=arr[i]+d2;
				}
				//System.out.println(arr[i]);
				//System.out.println(arr[i+1]+"\n");
			}
			//System.out.println(d1);
			//System.out.println(d2);
			System.out.println(arr[input4-1]);
		}
		else if (input1<input2 && input2<input3) {
			int d1=input2-input1;
			int d2=input3-input2;
			for (int i = 3; i < arr.length-1; i=i+2) {
				if(arr[0]<0 || arr[1]<0 || arr[2]<0) {
					arr[i]=arr[i-1]-d1;
					arr[i+1]=arr[i]-d2;
				}
				else {
					arr[i]=arr[i-1]+d1;
					arr[i+1]=arr[i]+d2;
				}
				//System.out.println(arr[i]);
				//System.out.println(arr[i+1]+"\n");
			}
			//System.out.println(d1);
			//System.out.println(d2);
			System.out.println(arr[input4-1]);
		}
	}
}
