package Milestone2;

public class DecodingTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="Encoding";
		String input2="ThreeStrings";
		String input3="EncodingThreeStringsProblem";
		String first="";
		String centre="";
		String last="";
		String temp="";
		String str[]= {input1,input2,input3};
		for (int i = 0; i < str.length; i++) {
			String front="";
			String middle="";
			String back="";
			temp=str[i];
			int l=str[i].length();
			if(str[i].length()%3==0) {
				int u=str[i].length()/3;
				front+=temp.substring(0,l-u-u);
				middle+=temp.substring(l-u-u,l-u);
				back+=temp.substring(l-u,l);
			}
			if(str[i].length()%3==1) {
				int r=str[i].length()/3;
				front+=temp.substring(0,r);
				middle+=temp.substring(r,l-r);
				back+=temp.substring(l-r,l);		
			}
			if(str[i].length()%3==2) {
				int m=str[i].length()/3;
				if(m%2==0) {
					front+=temp.substring(0,m+1);
					middle+=temp.substring(m+1,l-m-1);
					back+=temp.substring(l-m-1,l);
				}
				else {
					front+=temp.substring(0,m+1);
					middle+=temp.substring(m+1,l-m-1);
					back+=temp.substring(l-m-1,l);
				}
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
