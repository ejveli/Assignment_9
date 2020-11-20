package Assignment_9;

import java.util.Scanner;

public class Question_6 {

	/*
	 * Write a program that will reverse a string. Your program should reverse a
	 * string only 5 characters long. If the word is shorter, display message:
	 * "Too short!". If the word is longer, display the message: "Too long!".
	 * Otherwise, reverse this word and print out the result into the console.
	 * 
	 * Sample Output:
	 * 
	 * input: cat output: Too short!
	 * 
	 * 
	 * input: singularity output: Too long!
	 * 
	 * 
	 * input: apple output: elppa
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() < 5) {

			System.out.println("Too short!");

		} else if (word.length() > 5) {

			System.out.println("Too long!");
		} else {
			for (int i = word.length() - 1; i >= 0; i--) {

				System.out.print(word.charAt(i));

			}
		}
	}
}