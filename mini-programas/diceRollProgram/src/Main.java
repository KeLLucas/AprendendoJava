import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLES
        int numOfDice;
        int total = 0;

        // GET # OF DICE FROM THE USER
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();
        scanner.close();

        // CHECK IF # OF DICE > 0
        if (numOfDice > 0) {

            for(int i = 0; i < numOfDice; i++){

                // ROLL ALL DICE
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);

                // GET THE TOTAL
                total += roll;
            }

            System.out.println("total: " + total);

        }else
            System.out.println("# of dice must be greater than 0");


    }
    // DISPLAY ASCII OF DICE
    static void printDie(int roll) {

        String dice1 = """
                  -------
                |         |
                |    ●    |
                |         |
                  -------
                """;

        String dice2 = """
                  -------
                | ●       |
                |         |
                |       ● |
                  -------
                """;

        String dice3 = """
                  -------
                | ●       |
                |    ●    |
                |       ● |
                  -------
                """;

        String dice4 = """
                  -------
                | ●     ● |
                |         |
                | ●     ● |
                  -------
                """;

        String dice5 = """
                  -------
                | ●     ● |
                |    ●    |
                | ●     ● |
                  -------
                """;

        String dice6 = """
                  -------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                  -------
                """;

        switch (roll){
            case 1:
                System.out.print(dice1);
                break;
            case 2:
                System.out.print(dice2);
                break;
            case 3:
                System.out.print(dice3);
                break;
            case 4:
                System.out.print(dice4);
                break;
            case 5:
                System.out.print(dice5);
                break;
            case 6:
                System.out.print(dice6);
                break;
            default:
                System.out.println("Invalid roll!");
                break;
        }
    }

}
