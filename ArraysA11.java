package HandsOnAssignment;

public class ArraysA11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  mat=new int[3][3];
		int k=0;
		int max=0;
		if(args.length==9) {
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					mat[i][j]=Integer.parseInt(args[k++]);
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(max<mat[i][j]){
						max=mat[i][j];
					}
				}
			}
			System.out.println(max);
		}
		else{
		System.out.println("Please enter 9 integers");
		}
	}

}
