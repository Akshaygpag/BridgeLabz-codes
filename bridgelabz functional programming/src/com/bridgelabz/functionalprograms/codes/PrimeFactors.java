package com.bridgelabz.functionalprograms.codes;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class PrimeFactors {
	// INIT THE LOGGER
	private static final Logger LOG = Logger.getLogger(PowerOfTwo.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TAKE INPUT FOR NUMBER AND CALL GETPRIMEFACTORS
		Scanner scan = null;
		int number = 0;
		try {
			System.out.println("Enter the number whose prime factors are to be found");
			scan = new Scanner(System.in);
			number = scan.nextInt();
getPrimeFactors(number);
		} catch (Exception e) {
			LOG.error("Exception in [main][PrimeFactors]" + e.getMessage());
		}

	}

	private static void getPrimeFactors(int number) {
		// CALLS ISPRIME AND CALCULATES FINDS THE FACTORS
		for(int i=2;i*i<=number;i++){
			if(isPrime(i)){
				if(number%i==0){
					System.out.print(i+" ");
					
				}
			}
			
			
		}
		
		
	}

	private static boolean isPrime(int number) {
		// FIND WEATHER THE GIVEN LOCAL NUMBER IS A PRIME NUMBER OR NOT
for(int i=2;i<=Math.sqrt((double)number);i++){
	if(number%i==0){return false;}
}
		return true;
	}
}
