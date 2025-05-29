import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException { //method sleep
        Scanner scanner = new Scanner(System.in);
        // for loop = execute some code a CERTAIN amount of times

        for (int i = 0;i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("Enter how many times you want to loop");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++){
            System.out.println(i);
            Thread.sleep(550);
        }

        int start = 10;

        for (int i = start; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
