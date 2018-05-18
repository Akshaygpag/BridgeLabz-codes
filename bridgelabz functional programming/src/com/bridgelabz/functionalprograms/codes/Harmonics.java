package com.bridgelabz.functionalprograms.codes;

import org.apache.log4j.Logger;
import org.junit.Test;
/**
 * @author Akshay
 * @since 16-05-2018
 * @version 1.0.0
 */
public class Harmonics {
	// INIT THE LOGGER
	private static final Logger LOG = Logger.getLogger(PowerOfTwo.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// GET THE NUMBER AND VALIDATE IT
System.out.println("Enter number which is not equal to 0");
Scanner scan=new Scanner(System.in);
int data=scan.nextInt();
		
		if(data==0){System.out.println("You enterd 0 ");return;}
		int number = validateNumber(data);
		calculateNHarmonics(number);
	}

	private static void calculateNHarmonics(int number) {
		// THIS METHOD WILL RUN FROM 1 TO N AND INVERSE ITSELF AND AGGRIGATE
		// ITSELF
		double result = 0.0D;
		for (int i = 1; i <= number; i++) {
			result += (1.0 / i);
		}
		System.out.println("The Nth Harmonic value is (sigma)" + result);
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
