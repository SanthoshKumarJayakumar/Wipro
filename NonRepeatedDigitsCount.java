package Milestone;

import java.util.Scanner;

public class NonRepeatedDigitsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Input to Count the Non Repeated Digits Count");
		int input1=d.nextInt();
		String s=String.valueOf(input1);
		int flag = 0,count=0;
		char ch[]=s.toCharArray();
			for(int i=0;i<=s.length()-1;i++){
				for (int j =i+1; j < s.length(); j++) {
					if(ch[i]==ch[j]){
						ch[j]=' ';
						flag=1;
					}	
				}
				if(flag==1){
					ch[i]=' ';
					count++;
				}
				else{
					flag=0;
				}
			}
			
			if(input1>=1 && input1<=25000){
				System.out.println(count);  
			}
		d.close();
	}

}
