import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Temperature temp1 = new Temperature();
        temp1.printCelsius();

        Temperature temp2 = new Temperature(23.67);
        temp2.printCelsius();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double userValue = scanner.nextDouble();

        Temperature temp3 = new Temperature(userValue);

        temp3.printCelsius();

        temp3.printHotOrColdCelsius();

        double fahrenheit = temp3.calculateCelsiusToFahrenheit();
        System.out.println("Fahrenheit equivalent: " + fahrenheit + "°F");

        double kelvin = temp3.calculateCelsiusToKelvin();
        System.out.println("Kelvin equivalent: " + kelvin + " K");
    }
}
