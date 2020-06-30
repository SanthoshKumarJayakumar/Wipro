package Milestone;

public class ReturnSecondWordInUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="welcome 34220 split world";
		String[] arr = input1.split("\\s"); 
		System.out.println(arr[1].toUpperCase());
		/*String[] arr = input1.split("\\s",0);
		if(arr.length>=2){
			return arr[1].toUpperCase();
		}
			return "LESS";*/
	}

}
