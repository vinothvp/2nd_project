package Assignment_1;

public class Q_1 {
	public static void withoutswap() {
		int number1 = 10;
		int	number2 = 20;
		
		number1 = number2+number1;
		number2 = number1-number2;
		number1 = number1-number2;
		
		System.out.println("number1:"+number1);
		System.out.println("number2:"+number2);
		
	}

	public static void main(String[] args) {
		
		withoutswap();
	}

}
