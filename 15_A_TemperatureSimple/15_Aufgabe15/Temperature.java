public class Temperature {

    private double celsius;

    public Temperature() {
        this.celsius = 16;
    }
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void printCelsius() {
        System.out.println(celsius + "° Celsius.");
    }

    public void printHotOrColdCelsius() {
        if (celsius > 24) {
            System.out.println("It’s hot: " + celsius + "° Celsius!");
        } else {
            System.out.println("It’s freezing: " + celsius + "° Celsius!");
        }
    }

    public double calculateCelsiusToFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double calculateCelsiusToKelvin() {
        return celsius + 273.15;
    }
}
