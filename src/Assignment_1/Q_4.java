package Assignment_1;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		 String original, reverse = ""; // Objects of String class  
	      @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i); 
	      System.out.println(reverse); 
	      if (original.equals(reverse))  
	         System.out.println("name is a palindrome.");  
	      else  
	         System.out.println("name isn't a palindrome.");   
	   }  
		
		
		
		
		
	

}
