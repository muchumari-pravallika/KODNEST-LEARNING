package com.kodnest.logicaloperatorvalidator;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.print("Is input valid (true/false): ");
        boolean isValid=scan.nextBoolean();
        System.out.print("Does input meet a certain condition (true/false): ");
        boolean meetsCondition=scan.nextBoolean();
        boolean isInputValid=isValidInput(isValid, meetsCondition);
        if (isInputValid) {
            System.out.println("Input is valid.");
        } else {
            System.out.println("Input is not valid.");
        }
        scan.close();
	}
	
	public static boolean isValidInput(boolean isValid, boolean meetsCondition)
	{
		return isValid || meetsCondition;
	}
      

}
