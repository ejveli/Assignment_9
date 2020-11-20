package Assignment_9;

import java.util.Scanner;

public class Question_12 {
	public static void main(String[] args) {
		/*
		 * Given a string word, if the first or last chars are 'x' or 'X', print the
		 * string without those 'x' or 'X' chars, otherwise print the string unchanged.
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.substring(0, 1).equalsIgnoreCase("x")) {

			word = word.substring(1);

		}

		if (word.substring(word.length() - 1).equalsIgnoreCase("x")) {

			word = word.substring(0,word.length() - 1);

		}

		System.out.println(word);
	}

}
