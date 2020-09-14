package Assignment_1;

public class Q_3 {
	public static void character() {
		char[] array = {'k','u','m','a','r'};
		
		int i = 0 ; int j = array.length-1;
		System.out.println("Before reversing");
		
		for(int k = 0; k< array.length;k++) {
			
			System.out.print(array[k]+" ");
		}
		  
		while(i<j){
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			i =i + 1;
			j =j - 1;
			
		}
		System.out.println();
		System.out.println("After reversing");
		
		for(int k = 0; k< array.length;k++) {
			
			System.out.print(array[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		character();

	}

}
