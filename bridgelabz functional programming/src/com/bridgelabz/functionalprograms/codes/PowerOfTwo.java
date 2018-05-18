package com.bridgelabz.functionalprograms.codes;

import org.apache.log4j.Logger;
//import org.junit.Test;
import org.junit.Test;
/**
 * @author Akshay
 * @since 16-05-2018
 * @version 1.0.0
 */
public class PowerOfTwo {
	// INIT THE LOGGER
	private static final Logger LOG = Logger.getLogger(PowerOfTwo.class);

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// MAIN METHOD FOR VALIDATING AND CALLING POWER METHOD
		
		int number = validateNumber(args[0]);
		powerTwo(number);

	}

	private static void powerTwo(int number) {
		final int BASE = 2;
		for (int i = 0; i < number; i++) {
		if (i == number-1) {
				System.out.print(Math.pow(BASE, i));
			} else {

			System.out.print((long)Math.pow(BASE, i) + " , ");
			}

		}

	}

	@Test
	private static int validateNumber(String numberAsString) {
		int number = Integer.parseInt(numberAsString);
		try {

			assert (number > -1 && number < 31) : "enter from 1-30";

		} catch (NumberFormatException e) {
			LOG.error("Enter  valid number ");
		} catch (Exception e) {

			LOG.error(e.getMessage());

		}
		return number;
	}

}
