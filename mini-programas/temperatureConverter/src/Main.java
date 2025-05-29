import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // variables
        double temperature, newTemperature;
        String celsiusOrFahren;

        //enter the teperature
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        //convert to C or F
        System.out.print("Convert to Celsius or Fahrenheit? (C or F)) :");
        celsiusOrFahren = scanner.next().toUpperCase();

        scanner.close();

        // calculing new temperature
        newTemperature = (celsiusOrFahren.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;

        // Show new temperature
        System.out.printf("%.1fº%s", newTemperature, celsiusOrFahren);
    }
}