import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // While loop = repeat some code forever while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);



        int number = 0;

        do {
            System.out.println("Enter a number between 1 - 10");
            number = scanner.nextInt();
        }while (number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();


    }
}
