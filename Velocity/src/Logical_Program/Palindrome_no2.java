package Logical_Program;

import java.util.Scanner;

public class Palindrome_no2 {


		
		    public static boolean isPalindrome(String word) {
		        // Remove any spaces and convert the word to lowercase
		        word = word.replaceAll(" ", "").toLowerCase();

		        // Check if the word is equal to its reverse
		        StringBuilder reversed = new StringBuilder(word).reverse();
		        return word.equals(reversed.toString());
		    }

		    public static void main(String[] args) {
		        // Test the isPalindrome method with the word "NITIN"
		        String word = "NITIN";
		        if (isPalindrome(word)) {
		            System.out.println(word + " is a palindrome!");
		        } else {
		            System.out.println(word + " is not a palindrome.");
		        }
		    }
		

	}


