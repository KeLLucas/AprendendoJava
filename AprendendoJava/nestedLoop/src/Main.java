import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        //nested loop = A loop inside another loop
        //              Used often with matrices or DS&A

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        int cols;
        int rows;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        cols = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
