package com.bridgelabz.functionalprograms.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Gambler {
/**
 * @author Akshay
 * @since 16-05-2018
 * @version 1.0.0
 */
	public static void main(String[] args) {
System.out.println("Enter the times of games");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int goal = 10;
		int stack = 5;
		boolean winFlag = false;
		Random rand = new Random();
		int winCounter=0;
		 int timesGamesAvail=n;
		while (n > 0 && stack > 0 && stack < goal) {

			if (rand.nextInt() % 10 + 1 > 0) {

				System.out.println("  I win");
				stack += 1;
				winCounter++;
				if (stack == goal) {
					System.out.println("Target reached");
					winFlag = true;
					break;

				}
			}

			else {
				stack -= 1;
				System.out.println("I Loss");
				if (stack == 0) {
					System.out.println("Lost all money ");
				
					break;

				}

			}

			n--;

		}
		System.out.println("The no of times he/she won "+winCounter);
		System.out.println(" played times "+(-n+timesGamesAvail));
int value=((winCounter*100)/(-n+timesGamesAvail));

System.out.println("The percentage of win is "+(double)value+"%");
System.out.println("The percentage of loss is "+(double)(100-value)+"%");

	}

}
