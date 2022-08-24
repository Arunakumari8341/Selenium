package javaprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		 String str, reverse = "ammulu"; // Objects of String class  
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	     str = sc.nextLine();   
	      int length = str.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + str.charAt(i);  
	      if (str.equals(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");  
	}

		

	}


