import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choose;
        double weight, newWeight;

        System.out.println("====== Weight Conversion Program ======\n");

        // Choose your destiny
        do {
            System.out.println("=\t1. To convert lbs to kgs\t\t  =");
            System.out.println("=\t2. To convert kgs to lbs\t\t  =");
            System.out.println("=\t0. Exit\t\t\t\t\t\t\t  =");
            System.out.println("=======================================");
            System.out.print("--> ");


            choose = scanner.nextInt();
        }while(choose != 1 && choose != 2 && choose != 0) ;

        scanner.close();
        
        System.out.print("\n");
        //choose 1
       if(choose == 1) {
           System.out.print("Enter the weight in lbs: ");
           weight = scanner.nextDouble();
           newWeight = weight * 0.4535924;
           System.out.printf("The new weight in Kgs is: %.2f", newWeight);
       } else if (choose == 2) { //chose 2
           System.out.print("Enter the weight in kgs: ");
           weight = scanner.nextDouble();
           newWeight = weight * 2.204623;
           System.out.printf("The new weight in lbs2 is: %.2f\n", newWeight);
       }
        System.out.println("\n======================================");
   }
}

