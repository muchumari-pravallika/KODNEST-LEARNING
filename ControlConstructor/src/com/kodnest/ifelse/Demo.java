package com.kodnest.ifelse;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age");
		int age=scan.nextInt();
		scan.close();
		if(age>=18)
		{
			System.out.println("You Are Eligible For Voting");
		}
		else
		{
			System.out.println("You Are Not Eligible For Voting");
		}
		
	}

}
