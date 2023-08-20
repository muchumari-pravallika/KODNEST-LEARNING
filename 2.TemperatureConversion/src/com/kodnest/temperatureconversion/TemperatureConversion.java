package com.kodnest.temperatureconversion;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to the Temperature Conversion Tool!");
        System.out.println("Select an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        
        double celsius,fahrenheit;
        
        int choice=scan.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the temperature in Celsius: ");
                celsius=scan.nextDouble();
                fahrenheit=celsiusToFahrenheit(celsius);
                System.out.println(celsius+"°C is equivalent to "+fahrenheit+"°F");
                break;
                
            case 2:
                System.out.print("Enter the temperature in Fahrenheit: ");
                fahrenheit=scan.nextDouble();
                celsius=fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit+"°F is equivalent to "+celsius+"°C");
                break;
                
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
        scan.close();
 
	}
	
	public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
	
}
