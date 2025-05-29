import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product;
        double price;
        int quantity;
        double total;
        char currency = '$';

        System.out.print("What item would you like to buy?: ");
        product = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        scanner.close();

        total = price * quantity;

        if (quantity <= 0)
                System.out.print("The quantity should be more than 1");
        else if (quantity == 1 )
            System.out.print("You have bought 1 " + product);
        else
            System.out.println("You have bought " + quantity + " " + product + "s");

        System.out.printf("Your total is "+ currency+ " %.3f", total);
    }
}
