package Assignment_9;

import java.util.Scanner;

public class Question_10 {
	/*
	 * Write a program that will print out information about user based on email.
	 * Print first and last name from the upper case. Example: Input:
	 * craig_federighi@apple.com Output: First name: Craig Last name: Federighi
	 * Domain: apple Top-Level Domain: com
	 */
	
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		System.out.println(
				"First name: " + email.substring(0, 1).toUpperCase() + (email.substring(1, email.indexOf('_'))));
		System.out
				.println("Last name: " + (email.substring(email.indexOf('_') + 1, email.indexOf('_') + 2)).toUpperCase()
						+ email.substring(email.indexOf('_') + 2, email.indexOf('@')));
		System.out.println("Domain: " + email.substring(email.indexOf('@') + 1, email.indexOf('.')));
		System.out.println("Top-Level Domain: " + email.substring(email.indexOf('.') + 1, email.length()));
	}
}
