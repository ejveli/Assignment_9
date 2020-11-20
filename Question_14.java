package Assignment_9;

import java.util.Scanner;

public class Question_14 {
	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";

		System.out.println("Welcome to the CountyFarm car insurance!");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name");
		name = scan.nextLine();

		System.out.println("Do you have a US driver license?");
		continuousInsurance = scan.next();

		if (continuousInsurance.equalsIgnoreCase("no")) {

			System.out.println("Invalid data!");
			System.exit(0);

		} else {

			System.out.println("Enter your zip code");
			int zipCode = scan.nextInt();

			switch (zipCode) {

			case 20910:
				premium += 60;
				break;

			case 20740:
				premium += 60;
				break;

			case 22102:
				premium += 30;
				break;

			case 22103:
				premium += 30;
				break;

			default:
				premium += 50;
				break;

			}

			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.next();

			if (vehicleOwnership.equalsIgnoreCase("owned")) {

				premium += 10;

			} else {

				premium += 20;

			}

			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.next();

			if (vehicleUsage.equalsIgnoreCase("Business")) {

				premium += 50;

			} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {

				premium += 10;

			} else if (vehicleUsage.equalsIgnoreCase("Commute")) {

				premium += 20;

				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool = scan.nextInt();

				premium += 5 * daysDrivenToWorkOrSchool;

				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool = scan.nextInt();

				premium += milesToWorkOrSchool;

			}

			System.out.println("How old are you?");
			int age = scan.nextInt();

			if (age < 16) {

				System.out.println("Invalid data!");
				System.exit(0);

			} else if (age >= 16 && age < 18) {

				premium *= 20;

			} else if (age >= 18 && age <= 21) {

				premium *= 6;

			} else if (age >= 21 && age < 25) {

				premium *= 2;

			}

			System.out.println("How many years you've been driving?");
			int experiance = scan.nextInt();

			if (age - experiance < 16) {

				System.out.println("Invalid data!");
				System.exit(0);

			} else {

				premium -= 5 * experiance;

			}

			System.out.println("Have you had any accidents in the last 5 years?");
			String accidents = scan.next();

			if (accidents.equalsIgnoreCase("yes")) {

				System.out.println("How many?");
				accidentsAmount = scan.nextInt();

				for (int i = 1; i <= accidentsAmount; i++) {

					premium += (20 / 100.0) * premium*accidentsAmount;

				}

			}

			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.next();

			if (continuousInsurance.equalsIgnoreCase("no")) {

				premium *= 2;

			}

			scan.nextLine();
			System.out.println("What is the highest level of education you have completed?");
			education = scan.nextLine();

			if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")
					|| education.equalsIgnoreCase("Masters")) {

				premium *= 0.95;

			} else if (education.equalsIgnoreCase("Doctors")) {

				premium *= 0.90;

			} else if (education.equalsIgnoreCase("Less than High School")) {

				premium *= 1.05;
				education = education.replace(" ", "");

			}

			referenceNumber = (name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode + education).toUpperCase();

			System.out.println(name + ", here's your quote!");
			System.out.println("Start Your Policy Today For: $" + premium);
			System.out.println("Reference number: " + referenceNumber);

		}

	}

}
