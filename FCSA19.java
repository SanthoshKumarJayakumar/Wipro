package HandsOnAssignment;

public class FCSA19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1;
		int count=0;
		System.out.println("Five values which are divisible by 2, 3 & 5 are:");
		while(count<5){
			if(m%2==0 && m%3==0 && m%5==0){
				System.out.print(m+" ");
				count++;
			}
			m++;
		}
	}
}
