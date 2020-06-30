package HandsOnAssignment;
import java.util.Arrays;
public class ArraysA07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {12,34,12,45,67,89};
		int len=arr.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]==arr[j]){
					int shift=j;
					for(int k=j+1;k<len;k++){
						arr[shift]=arr[k];
					}
					len--;
					j--;
				}
			}
		}
		int arrDup[]=new int[len];
		for(int i=0;i<len;i++){
			arrDup[i]=arr[i];
		}
		System.out.println(Arrays.toString(arrDup));
	}
}


