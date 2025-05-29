import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //variables
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        //Game
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d - %d:\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber)
                System.out.println("Too Low! Try again");
            else if (guess > randomNumber)
                System.out.println("Too High! Try again");
            else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        }while(guess != randomNumber);

        System.out.println("You have won");

    }
}