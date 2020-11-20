package Assignment_9;

import java.util.Scanner;

public class Question_1 {

	/*
	 * Create a method called tipCalculator which accepts parameters: boolean
	 * isSplit, int numberPeople, double checkAmount, String serviceQuality
	 * 
	 * Ask the user to enter each value.
	 * 
	 * User should select service quality that will correspond to tip percent.
	 * 
	 * Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%
	 * 
	 * The program should display the following information based on the user input:
	 * Split or No split Number of people entered: &&&& Service Quality: Total to
	 * pay: Total tip: Total per person: Tip per person:
	 * 
	 Input:
			Split:Yes
			Number of people:4
			Check amount:476.0
			Service Quality:Excellent
	 * 
	 * Output:
			Number of people entered: &&&&
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Split:");
		String split = scan.next();

		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();

		System.out.println("Check amount:");
		double amount = scan.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = scan.next();

		double totalTip = 0;
		double totalPay = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;

		// WRITE YOUR CODE HERE
		if (split.equals("Yes")) {

			switch (serviceQuality) {

			case "Poor":

				totalTip = amount * 0.05;
				break;

			case "Fair":

				totalTip = amount * 0.10;
				break;

			case "Good":

				totalTip = amount * 0.15;
				break;

			case "Great":

				totalTip = amount * 0.20;
				break;

			case "Excellent":

				totalTip = amount * 0.25;
				break;

			}

			totalPay = totalTip + amount;
			totalPerPerson = totalPay / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;

			System.out.print("Number of people entered: ");

			for (int i = 0; i < numberOfPeople; i++)
				System.out.print("&");

			System.out.println("\nTotal to pay: " + totalPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);

		}

	}

}