package com.kodnest.asignment;

import java.util.Scanner;

public class NestedIfElse2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scan.nextInt();
        if (num<0) {
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is positive.");
            if(num%2==0) {
                System.out.println("The positive number is even.");
            } 
            else {
                System.out.println("The positive number is odd.");
            }
            }
        scan.close();
	}

}
