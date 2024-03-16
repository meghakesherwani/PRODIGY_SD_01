package Task1;
import java.util.*;

public class TemperatureConversion {

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Welcome to Temperature Converter----------");
        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();
        sc.nextLine();
        // Consume newline

        System.out.print("Enter the original unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = sc.nextLine().toLowerCase();

        if (originalUnit.equals("celsius"))
        {
            double fahrenheit = celsiusToFahrenheit(temperature);
            double kelvin = celsiusToKelvin(temperature);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            System.out.println("Temperature in Kelvin: " + kelvin);

        }

        else if (originalUnit.equals("fahrenheit"))
        {
            double celsius = fahrenheitToCelsius(temperature);
            double kelvin = celsiusToKelvin(celsius);
            System.out.println("Temperature in Celsius: " + celsius);
            System.out.println("Temperature in Kelvin: " + kelvin);

        }
        else if (originalUnit.equals("kelvin"))
        {
            double celsius = kelvinToCelsius(temperature);
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Celsius: " + celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        }

        else
        {
            System.out.println("Invalid unit of measurement.");
        }

        sc.close();
    }


}
