

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student First Name");
		String fn=scan.next();
		System.out.println("First Name= "+fn);
		System.out.println("Enter Student Last Name");
		String ln=scan.next();
		System.out.println("Last Name= "+ln);
		System.out.println("Enter Student Age");
		int age=scan.nextInt();
		System.out.println("Age= "+age);
		System.out.println("Enter Student Gender");
		String gender=scan.next();
		System.out.println("Gender= "+gender);
		System.out.println("Is Student Married? say True or False");
		boolean ismarried=scan.nextBoolean();
		System.out.println("Student married= "+ismarried);
		System.out.println("Enter Student Branch");
		scan.nextLine();
		String branch=scan.nextLine();
		System.out.println("Branch= "+branch);
		System.out.println("Enter Student Height");
		float height=scan.nextFloat();
		System.out.println("Height= "+height);
		System.out.println("Enter Student Weight");
		double weight=scan.nextDouble();
		System.out.println("Weight= "+weight);
		scan.close();
		
	}

}
