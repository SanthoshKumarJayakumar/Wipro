package Milestone2;

public class Decoding {

	public static void main(String[] args) {
		String input1="KLErINg";
		String input2="sEgeEnGi";
		String input3="rcOLnEE";
		
		String first="";
		String centre="";
		String last="";
		String temp1=input1,temp2=input2,temp3=input3;
		int ln[]= {3,8,11};
		String str[]= {input1,input2,input3};
		for (int i = 0; i < str.length; i++) {
			int len=ln[i];
			String front="";
			String middle="";
			String back="";
			int l=len/3;
			if(len%3==0) {
				int u=len/3;
				front+=temp1.substring(0,u);
				middle+=temp2.substring(0,u);
				back+=temp3.substring(0,u);
				//System.out.println(front);
				//System.out.println(middle);
				//System.out.println(back);

			}
			if(len%3==1) {
				int r=len/3;
				front+=temp1.substring(r,r+r+1);
				middle+=temp2.substring(r,r+r+1);
				back+=temp3.substring(r,r+r+1);	
				System.out.println(front);
				System.out.println(middle);
				System.out.println(back);

			}
			if(len%3==2) {
				int m=str[i].length()/3;
			//	front+=temp1.substring(0,m+1);
			//	middle+=temp1.substring(m+1,l-m-1);
			//	back+=temp1.substring(l-m-1,l);
			}	
		}
		System.out.println(first);
		System.out.println(centre);
		char ch[]=last.toCharArray();
		String back1="";
		for(int p=0;p<ch.length;p++){
			if(Character.isUpperCase(ch[p])){
				back1+=Character.toLowerCase(ch[p]);
			}
			else{
				back1+=Character.toUpperCase(ch[p]);
			}
		}
		System.out.println(back1);
	}
}
/*
  
			String front="";
			String middle="";
			String back="";
			temp1=str[i];
			int l=str[i].length();
			if(str[i].length()%3==0) {
				int u=str[i].length()/3;
				front+=temp1.substring(0,l-u-u);
				middle+=temp1.substring(l-u-u,l-u);
				back+=temp1.substring(l-u,l);
			}
			if(str[i].length()%3==1) {
				int r=str[i].length()/3;
				front+=temp1.substring(0,r);
				middle+=temp1.substring(r,l-r);
				back+=temp1.substring(l-r,l);		
			}
			if(str[i].length()%3==2) {
				int m=str[i].length()/3;
				front+=temp1.substring(0,m+1);
				middle+=temp1.substring(m+1,l-m-1);
				back+=temp1.substring(l-m-1,l);
			}		
			if(i==0) {
				first+=front;
				centre+=middle;
				last+=back;
			}
			else if(i==1) {
				first+=middle;
				centre+=back;
				last+=front;
			}
			else if(i==2)  {
				first+=back;//middle
				centre+=front; // for above cases
				last+=middle;//back
			}
		*/