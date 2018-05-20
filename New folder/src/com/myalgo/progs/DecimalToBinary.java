package com.myalgo.progs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// THIS METHOD WILL BE USED CALL THE STATIC METHOD TO TAKE USER DECIAL VALUE AND
		// RETURN STRING OF CHARS WHICH CONTAINS THE BINARY REP OF THE DATA
		/*
		 * Scanner scan = new Scanner(System.in); System.out.
		 * println("Enter the decimal value which is to be convered to binary"); int
		 * decimal = scan.nextInt(); String binary = toBinary(decimal);
		 * 
		 * System.out.println("The decimal value of the number is : "+decimal);
		 * 
		 * 
		 * 
		 * System.out.println("The binary value of the number is : "+binary);
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the decimal value which is to be convered to binary");
		int decimal = scan.nextInt();

		String binary = toBinary(decimal);
		int i = 0;

		while (binary.charAt(i) == '0') {
			i++;
		}

		String data = binary.substring(i, binary.length());
		i = 0;

		System.out.println(data);
		List<String> nibbles = new ArrayList<String>();
		if (!(data.length() % 4 == 0)) {
			// PREPPEND IT WITH 0
			data = "0" + data;

		}

		System.out.println(data + " : is the data");
		// CAN BE EASILY DIVIDE INTO NIBBLES
		int k = i;

		while (i < data.length()) {
			if ((i + 1) % 4 == 0) {
				String singleNibble = data.substring(k, i + 1);
				nibbles.add(singleNibble);
				k = i + 1;
			}
			i++;
		}
System.out.println(nibbles.get(1).concat(nibbles.get(0)));
		String binaryToDecimal = toDecimal(nibbles.get(1).concat(nibbles.get(0)));
		System.out.println("decimal value is : " + binaryToDecimal);
	}

	private static String toDecimal(String concat) {
		// CONVERT FROM BINARY TO DECIMAL

		int len = concat.length() - 1;
		int result = 0;
		int i = 0;
		while (len >= 0) {

			result = result + Integer.parseInt(String.valueOf(concat.charAt(len))) * (int) Math.pow(2, i);
			len--;
			i++;
		}

		return String.valueOf(result);
	}

	public static String toBinary(int decimal) {
		// THIS METHOD WILL TAKE THE DECIMAL VALUE AND DIVIDE IT TILL 0 OR 1
		StringBuffer binaryData = new StringBuffer();
		while (decimal > 0) {

			int remainder = decimal % 2;
			binaryData.append(remainder);
			decimal = decimal / 2;

		}
		while (binaryData.length() != 32) {

			binaryData.append("0");

		}
		binaryData.setLength(32);

		return binaryData.reverse().toString();
	}

}