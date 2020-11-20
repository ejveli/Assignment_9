package Assignment_9;

import java.util.Scanner;

public class Question_5 {

	/*
	 * You have 2 words, both of them have 3 characters. If either of them does not
	 * have exactly 3 characters, print "cannot merge" Merge their characters one by
	 * one and print together like below:
	 * 
	 * Sample Output:
	 * 
	 * aok lol -->alookl
	 * 
	 * ear pie -->epaire
	 * 
	 * java wow -->cannot merge
	 */

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 String word1 = scan.next();
		 String word2 = scan.next();
		    //YOUR CODE HERE
		 if (word1.length() != word2.length()) {

			System.out.println("cannot merge");
		} else {

			for (int i = 0; i < word1.length(); i++) {
				for (int j = 0; j < word2.length(); j++) {
						
					if (i == j) {

					System.out.print(word1.charAt(i) + "");
							System.out.print(word2.charAt(j));
					}
				}
			}
		}
	}
}
