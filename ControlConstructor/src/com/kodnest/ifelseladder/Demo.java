package com.kodnest.ifelseladder;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Score");
		int score=scan.nextInt();
		scan.close();
		Grade.giveGrade(score);
	}

}
