import java.util.Scanner;

public class TemperatureConvereterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature to conert to celsius");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double celsius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(celsius);
		scan.close();
	}

}
