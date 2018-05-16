package com.bridgelabz.functionalprograms.codes;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = null;
		String yearString = null;
		long year = 0L;
		String result = null;
		try {
			scan = new Scanner(System.in);
			System.out.println("Enter the year in YYYY format");
			yearString = scan.nextLine();
			year = Integer.parseInt(yearString);
			if (year > 1581) {
				result = leapChecker(year);

				System.out.println(year + " : " + result);
				return;
			}
			throw new Exception();

		} catch (NumberFormatException nfe) {
			System.out.println("enter only numbers for year");
			System.exit(1);
		}

		catch (Exception e) {
			System.out.println("Exception enter +ve Year greater than 1581");

		}

	}

	private static String leapChecker(long year) {
		if (year % 400 == 0) {
			return "Is a leap year";
		}
		if (year % 4 == 0 && !(year % 100 == 0)) {
			return "Is a leap year";

		}
		return "Is not a leap year";

	}

}
