package Milestone2;

public class AlphabetWithCount {
	public static void main(String[] args) {
		String input="aaaaaaaabbbbbbbbbb"; // aaabcddyyyyrrttpkmmmm  upto 9 sum values only
		char ch[]=input.toCharArray();
		String res="";
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			if(!res.contains(String.valueOf(ch[i]))) {
				res+=ch[i];
				count+=1;
				res+=count;
			}
			else if(res.contains(String.valueOf(ch[i]))){
				String s=res.valueOf(res.charAt(res.indexOf(ch[i])+1));
				int in=Integer.parseInt(s);
				in+=1;
				res=res.substring(0,res.indexOf(ch[i])+1)+in+res.substring(res.indexOf(ch[i])+2, res.length());
			}	
		}
		System.out.println(res);
	}
}
/*//	System.out.println(ch[i]);
			//	System.out.println(res+1);
			//  System.out.println(res.indexOf(ch[i])+1);
				String s=res.valueOf(res.indexOf(ch[i])+1);
				System.out.println("s"+s);
//				String s=res.valueOf(res.charAt(res.length()-1));
				int in=Integer.parseInt(s);
				in+=1;
				System.out.println(res.substring(0,res.indexOf(ch[i])+1));
				System.out.println(in);
				System.out.println(res.substring(res.indexOf(ch[i])+2, res.length()-1));
res=res.substring(0,res.indexOf(ch[i])+1)+in+res.substring(res.indexOf(ch[i])+1, res.length()-1);
				//res=res.substring(0,res.length()-1);
				//res+=in;*/
