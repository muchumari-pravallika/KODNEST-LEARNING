import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int a=scan.nextInt();
		System.out.println("Value in a is" +a);
		System.out.println("Enter a real number");
		float b=scan.nextFloat();
		System.out.println("Value in b is" +b);
		System.out.println("Enter a Another real number");
		double c=scan.nextDouble();
		System.out.println("Value in c is" +c);
		System.out.println("Are you Married? say True or False");
		boolean d=scan.nextBoolean();
		System.out.println("value in d is "+d);
		System.out.println("Enter Your Insta Id");
		String e=scan.next();
		System.out.println("Value in e is" +e);
		System.out.println("Enter Your FULL NAME");
		scan.nextLine();
		String f=scan.next();
		System.out.println("Value in f is" +f);
		scan.close();
	}

}
