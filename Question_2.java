package Assignment_9;

import java.util.Scanner;

public class Question_2 {

	/*
	 * Write a program that will calculate laptop price based on the components.
	 * 
	 * First, ask user for screen size. If screen size equals to 13.3, add $200 to
	 * the laptop price. If screen size equals to 15.0 - add $300 to the laptop
	 * price. If screen size equals to 17.3 - add $400 to the laptop price.
	 * 
	 * Then ask the user for CPU type. If CPU type equals to i3, add $150 to the
	 * laptop price. If CPU type equals to i5, add $250 to the laptop price. If CPU
	 * type equals to i7, add $350 to the laptop price.
	 * 
	 * Then ask the user for RAM size. Add $50 for every 4GB of ram to the laptop
	 * price.
	 * 
	 * Then, ask the user for the storage type. There are 2 options: SSD and HDD. If
	 * it's HDD - add $50 to the laptop price for every 500gb. If it's SSD - add
	 * $100 to the laptop price for every 500GB.
	 * 
	 * Then ask the user for screen resolution. There are 2 options: FULLHD and 4K.
	 * Add $100 if it's FULLHD screen and $200 if it's 4K screen.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Select  Screen Size: ");
		double screenSize = scan.nextDouble();
		
		System.out.print("Select  CPU Type: ");
		String cpuType = scan.next();
		
		System.out.print("Select  RAM Size: ");
		int ramSize = scan.nextInt();
		
		System.out.print("Select  Storage Type: ");
		String storageType = scan.next();

		System.out.print("Enter Memory Size: ");
		int memorySize = scan.nextInt();

		System.out.print("Enter Screen Resolution: ");
		String screenResolution = scan.next();
		
		double totalPrice=0;
		
		if(screenSize==13.3) {
			totalPrice+=200;
		}else if(screenSize==15) {
			totalPrice+=300;
		}else if(screenSize==17.3) {
			totalPrice+=400;
		}
		
		if(cpuType.equals("i3")) {
			totalPrice+=150;
		}else if(cpuType.equals("i5")) {
			totalPrice+=250;
		}else if(cpuType.equals("i7")) {
			totalPrice+=350;
		}
		
		if(ramSize>=4) {
			totalPrice+=(50*ramSize/4);
		}
		
		if(storageType.equals("HDD")) {
			totalPrice+=(50*memorySize/500);
		}else if(storageType.equals("SSD")) {
			totalPrice+=(100*memorySize/500);
		}
		
		if(screenResolution.equals("FULLH")) {
			totalPrice+=100;
		}else if(screenResolution.equals("4K")) {
			totalPrice+=200;
		}
		
		System.out.println("Laptop price is: "+totalPrice);
	}
}