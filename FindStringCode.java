package Milestone2;

import java.util.Scanner;

public class FindStringCode {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		String input1=d.nextLine();
		String str=input1.toLowerCase(),result="";
		String []arr=str.split("\\s");
		String s="abcdefghijklmnopqrstuvwxyz";
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			String temp=arr[i];
			if(temp.length()%2==1) {
				int t1=temp.length()-1;
				for(int j=0;j<=(temp.length()/2);j++,t1--) {
					if(j!=temp.length()/2) {
						sum+=Math.abs((s.indexOf(temp.charAt(j))+1)-(s.indexOf(temp.charAt(t1))+1));
					}
					else if(j==temp.length()/2) {
						sum+=(s.indexOf(temp.charAt(j))+1);
					}
				}
			}
			else {
				int t1=temp.length()-1;
				for(int j=0;j<(temp.length()/2);j++,t1--) {
					sum+=Math.abs((s.indexOf(temp.charAt(j))+1)-(s.indexOf(temp.charAt(t1))+1));
				}
			}
			result+=String.valueOf(sum);
			sum=0;
			}
			int i=Integer.parseInt(result);
			System.out.println(i);	
			d.close();
		/*
		String input1=d.nextLine().toUpperCase();
		String arr[]=input1.split(" ");
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<arr.length;i++){
			String str=arr[i];
			int str1=0;
			if(str.length()%2==0) {
				for (int j = 0; j < str.length()-1; j++) {
					int k=0;
					int ch1=s.indexOf(str.charAt(j)+1);
					int ch2=s.indexOf(str.charAt(str.length()-1-k)+1);
					str1+=Math.abs(ch1-ch2);						
					k++;
				}
				sb1.append(str1);
			}
			else if(str.length()%2!=0){	
				StringBuilder sb=new StringBuilder(str);
				int ch12=s.indexOf(str.charAt(str.length()/2)+1);
				sb.deleteCharAt(str.length()/2);
				str=sb.toString();
				for (int v = 0; v < str.length(); v++) {
					int k=1;
					int ch1=s.indexOf(str.charAt(v)+1);
					int ch2=s.indexOf(str.charAt(str.length()-1-k)+1);
					str1+=Math.abs(ch1-ch2);						
					k++;
					}
				str1=Math.abs(str1)+Math.abs(ch12);	
				sb1.append(str1);
			}	
		}
		String t=sb1.toString();
		System.out.println(Integer.valueOf(t));
		d.close();*/
	}
}