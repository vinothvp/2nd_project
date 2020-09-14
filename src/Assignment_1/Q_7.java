package Assignment_1;

public class Q_7 {

	public static void main(String[] args) {
		int [] num = {9,3,6,1,5,2,2};
		
		int temp = num[1];
		num[1] = num[4];
		num[4] = temp;
		
		for(int i = 0; i<=6;i++) {
			System.out.print(num[i]+" ");
			
		}

	}

}
