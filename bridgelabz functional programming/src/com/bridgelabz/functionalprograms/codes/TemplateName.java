package com.bridgelabz.functionalprograms.codes;

import java.util.Formatter;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TemplateName {
/**
 * @author Akshay
 * @since 16-05-2018
 * @version 1.0.0
 */
	// CREATING A LOGGER REF
	private static final Logger LOG = Logger.getLogger(TemplateName.class);

	public static void main(String[] args) {
		// MAIN METHOD FOR TAKING NAME AND CALLING PRINTWELCOMEMESSAGE
		Scanner scan = null;// scanner ref created
		String name = null;
		try {
			System.out.println("Enter your name.");
			scan = new Scanner(System.in);
			name = scan.nextLine();
			if(name.length()<3){
		System.out.println("Enter Minium three length string");
				return;
			}
			printWelcomeMessage(name);

		} catch (Exception e) {
			LOG.error("Exception occured in [main][TemplateName]");
		}

	}

	private static void printWelcomeMessage(String name) {
		Formatter format = null;
		try {
			String[] names = { name };
			format = new Formatter(System.out);
			format.format("Hello %s, How are you?", names);//PRINTING THE FORMATED DATE TO STDOUT

		} catch (Exception e) {

			LOG.error("Exception occured in [printWelcomeMessage][TemplateNmae]");
		}
	}

}
