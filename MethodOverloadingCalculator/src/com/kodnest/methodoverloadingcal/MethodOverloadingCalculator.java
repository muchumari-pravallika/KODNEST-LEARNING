package com.kodnest.methodoverloadingcal;

import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        double num1=scan.nextDouble();
	        System.out.print("Enter the second number: ");
	        double num2 = scan.nextDouble();
	        System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = scan.next().charAt(0);
	        double result = add(num1, num2);
	        System.out.println("Result: " + result);

	        scan.close();
	    }

	    public static double add(double num1, double num2) {
	    	return num1+num2;
	    }
	    
	    public static double sub(double num1, double num2) {
	    	return num1-num2;
	    }
	    
	    public static double mul(double num1, double num2) {
	    	return num1*num2;
	    }
	    
	    public static double div(double num1, double num2) {
	    	return num1/num2;
	    }

	}
