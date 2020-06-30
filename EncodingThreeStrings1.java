package Milestone2;

public class EncodingThreeStrings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="John";
		String input2="Johny";
		String input3="Janardhan";
		String front="";
		String middle="";
		String back="";
		String 	temp="";
		String str[]= {input1,input2,input3};
		for (int i = 0; i < str.length; i++) {
			temp=str[i];
			int l=str[i].length();
			if(str[i].length()%3==0) {
				int u=str[i].length()/3;
				middle+=temp.substring(0,l-u-u);
				back+=temp.substring(l-u-u,l-u);
				front+=temp.substring(l-u,l);
			}
			if(str[i].length()%3==1) {
				if(str[i].length()%2==0) {
					front+=temp.substring(0,l/2-1);
					middle+=temp.substring(l/2-1,l/2+1);
					back+=temp.substring(l/2+1,l);
				}
				else {
					front+=temp.substring(0,l/2);
					middle+=temp.substring(l/2,l/2+1);
					back+=temp.substring(l/2+1,l);
				}
			}
			if(str[i].length()%3==2) {
				back+=temp.substring(0,l/2);
				front+=temp.charAt(l/2);
				middle+=temp.substring(l/2+1,l);
			}	
		}
		System.out.println(front);
		System.out.println(middle);
		char ch[]=back.toCharArray();
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
