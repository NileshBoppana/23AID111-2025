class Temperature {

    double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }

    double convert(double celsius, int type) {
        return celsius + 273.15;
    }
}

public class Main59 {
    public static void main(String[] args) {
        Temperature t = new Temperature();

        double fahrenheit = t.convert(25.0);
        double kelvin = t.convert(25.0, 1);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);
    }
}