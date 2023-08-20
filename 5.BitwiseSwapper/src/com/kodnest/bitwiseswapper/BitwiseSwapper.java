package com.kodnest.bitwiseswapper;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int first = scan.nextInt();
        System.out.print("Enter the second integer: ");
        int second = scan.nextInt();
        swapUsingBitwise(first, second);
        System.out.println("After swapping: First = " +second+ ", Second = " + first);
        scan.close();

		
	}
	public static void swapUsingBitwise(int a,int b) {
        a = a ^ b;
	}

}
