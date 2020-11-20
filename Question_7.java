package Assignment_9;

import java.util.Scanner;

public class Question_7 {

	/*
	 Write a program that will print out the first half of the word twice.

Sample Output:

     input: java
     output: jaja
	 */

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		    
		 int a=word.length();
				
			System.out.println(word.substring(0,a/2)+word.substring(0,a/2));
		  }
		}