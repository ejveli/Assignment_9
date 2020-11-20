package Assignment_9;

import java.util.Scanner;

public class Question_15 {
	public static void main(String[] args) {
		/*Print true if the string "cat" and "dog" appear the same number of times in the given string word. 
		Example:
		input: catdog
		output: true
		
		Example:
		input: catcat
		output: false
		
		Example:
		input: cat-cheetah-dog-cat
		output: false
		*/
		
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.nextLine();

		for (int i = 0; i < word.length(); i++) {

			if (word.contains("dog")) {
				if (word.indexOf("dog", i) > -1) {

					i = word.indexOf("dog", i);
					countOfDogs++;
				}
			}  
		}
		for (int i = 0; i < word.length(); i++) {

			if (word.contains("cat")) {
				if (word.indexOf("cat", i) > -1) {

					i = word.indexOf("cat", i);
					countOfCats++;
				}
			}
		}
		System.out.println(countOfDogs == countOfCats);

	
	}
}
