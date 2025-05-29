import java.util.Random;

public class Main {
    public static void main (String[] args) {
        // Ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        Random random = new Random();

        int score = 55;

        String passOrFail = (score >= 70) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        int number = random.nextInt(0 , 11);

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.print(evenOrOdd);
    }
}
