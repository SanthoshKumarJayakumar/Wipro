package HandsOnAssignment;

public class FCSA14 {
  public static void main(String[]args){
	  if(args.length>=1){
		  int num=Integer.parseInt(args[0]);
		  int count=0;
		  if((num==0)||(num==1)){
		  System.out.println(num+" is neither prime nor composite");
		  }
		  else{
			  for(int i=2;i<num;i++){
				  if(num%i==0){
					  count++;
				  }
			  }
			  if(count==0){
				  System.out.println(num+" is a Prime Number");
			  }
			  else{
				  System.out.println(num+"is not a Prime Number");
			  }
		  }
	  }
	  else{
		  System.out.println("Please enter an integer number");
	  }
  }
}