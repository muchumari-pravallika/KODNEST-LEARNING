package com.kodnest.asignment;

import java.util.Scanner;

public class NestedIf {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the marks:");
			int marks=scan.nextInt();
			if(marks>40 && marks<=100) {
				if(marks>=90 && marks<100) {
					System.out.println("A+-Grade..");
				}
				if(marks>=80 && marks<90) {
					System.out.println("A-Grade..");
				}
				if(marks>=70 && marks<80) {
					System.out.println("B-Grade..");
				}
				if(marks>=60 && marks<70) {
					System.out.println("C-Grade...");
				}
				if(marks>=50 && marks<60) {
					System.out.println("D-Grade..");
				}
				if(marks>=40 && marks<50) {
					System.out.println("Just pass..");
				}
				scan.close();
			}
		}
}


