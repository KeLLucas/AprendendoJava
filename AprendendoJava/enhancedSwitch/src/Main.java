import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enhanced switch = A replacement to many else if statements

        String day;

        day = scanner.nextLine().trim().toLowerCase();

        scanner.close();

        switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" :
                System.out.print("It is a weekday 🙁");
                break;
            case "saturday", "sunday" :
                System.out.print("It is a weekend 😄");
                break;
            default:
                System.out.print("It is not a day");
        }
    }
}