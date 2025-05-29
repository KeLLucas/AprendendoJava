import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Compound Interest --> A = P * (1 + (r/m)) ^ m * t

        Scanner scanner = new Scanner(System.in);

        double principal, rate, compoundInterest;
        int timesYears, years;
        char currency = '$';

        System.out.printf("Enter the principal amount: %c ", currency);
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesYears = scanner.nextInt();

        System.out.print("Enter the % of years: ");
        years = scanner.nextInt();

        scanner.close();

        compoundInterest = principal * Math.pow(1 + rate / timesYears, timesYears * years);

        System.out.printf("The amount after %d years is %c%,.2f", years , currency, compoundInterest);


    }
}
