package com.kodnest.calulatordilemma;

import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an operator");
		char operator =scan.next().charAt(0);
		System.out.println("Enter first number");
		double num1=scan.nextDouble();
		System.out.println("Enter second number");
		double num2=scan.nextDouble();
		double result;
		
		
		switch(operator)
		{
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
			
		case '-':
			result=num1-num2;
			System.out.println(result);
			break;
			
		case '*':
			result=num1*num2;
			System.out.println(result);
			break;
			
		case '/':
			result=num1/num2;
			System.out.println(result);
			break;
		
		default:
			System.out.println("Invalid Operator");
		}
		scan.close();
		
	}

}
