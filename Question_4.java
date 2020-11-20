package Assignment_9;

import java.util.Scanner;

public class Question_4 {

	/*
	 You have a word, do the following:

If the word has odd number of characters and has 5 or more characters, 
print the middle three characters of the word. Otherwise, print "invalid".

Sample Output:

       fifteen ==> fte
       apple ==> ppl
       hey ==> invalid
       java ==> invalid
       whatsup ==> ats
       $ ==> invalid
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int lenght = word.length();

		if (lenght >= 5 && lenght % 2 != 0) {

			System.out.println(word.substring((lenght - 1) / 2 - 1, (lenght + 1) / 2 + 1));
		} else {
			System.out.println("invalid");
		}
	}
}