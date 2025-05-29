import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces and underscores

        String username;

        System.out.println("Enter your username: ");
        username = scanner.nextLine().trim();

        if (username.length() < 4 || username.length() > 12)
            System.out.println("username must be between 4-12 characters");
        else if (username.contains(" ") || username.contains("_"))
            System.out.println("username must not contain spaces and underscores");
        else
            System.out.println("Welcome, " + username);

        scanner.close();
    }
}
