package HandsOnAssignment;

public class FCSA16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if(args.length>=1){
		    	int num =Integer.parseInt(args[0]);
		    	for(int i=1;i<=num;i++){
		    		for(int j=1;j<=i;j++){
		    			System.out.print("*");
		    		}
		    		System.out.println();
		    	}
		 }
		 else{
		    	System.out.println("Please enter an integer input");
		 }
	}
}


