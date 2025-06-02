import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int numOfFoods;

        System.out.print("What # of food do you want?: ");
        numOfFoods = scanner.nextInt();

        foods = new String[numOfFoods];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.next();
        }

        scanner.close();

         Arrays.sort(foods);

        for (String food : foods){
            System.out.println(food);
        }
    }
}