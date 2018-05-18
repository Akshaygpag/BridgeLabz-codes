package com.bridgelabz.functionalprograms.codes;

import java.util.Random;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.bridgelabz.functionalprograms.exceptions.GenericException;
/**
 * @author Akshay
 * @since 16-05-2018
 * @version 1.0.0
 */
public class FlipCoins {
	// INIT LOGGER
	private static final Logger LOG = Logger.getLogger(FlipCoins.class);
	private static int headCount;// COUNTS THE TIMES HEAD IS GOT
	private static int tailCount;// COUNTS THE TIMES TAIL IS GOT

	/**
	 * @param args
	 * @author akshay
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Scanner scan = null;
		int timesOfFlip = 0;
		try {
			System.out.println("Enter the no of times the coin is filpped");
			scan = new Scanner(System.in);
			timesOfFlip = scan.nextInt();
			if (timesOfFlip > 0) {
				flipCoinObserver(timesOfFlip);
			} else {
				throw new GenericException("Enter +ve number of times the coin has to be flipped ");
			}

		} catch (GenericException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {

			LOG.error("Exception occured in [main][FlipCoins]");
		}
	}

	private static void flipCoinObserver(int timesOfFlip) {
		Random rand = null;
		rand = new Random();
		int timesToss = timesOfFlip;
		try {

			while (timesToss > 0) {
				System.out.println("inside the while");
				float filpResult = rand.nextFloat();

				System.out.println(filpResult + " is the flip res");
				if (filpResult < 0.5F) {
					// BY LOGIC ITS TAIL
					tailCount++;
				} else {
					// BY LOGIC ITS HEAD
					headCount++;
				}
				timesToss--;
			}
			System.out.println("Total no of times the coin is flipped " + timesOfFlip);
			System.out.println("Percentage of head obtained : " + ((headCount * 100) / timesOfFlip)
					+ "%");
			System.out.println("Percentage of tail obtained : " + ((tailCount * 100) / timesOfFlip)
					+ "%");

		} catch (Exception e) {
			LOG.error("Exception in [flipCoinObserver][FlipCoin]");
		}
	}
}
