import java.util.Arrays;

public class Main {
    static public void main(String[] args) {

        //array = a collection of values of the same data type
        //          * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "pineapple", "donut"};

        System.out.println(fruits[fruits.length - 1]);

        int numOfFruits = fruits.length;

        System.out.println(numOfFruits);

        //Arrays.sort(fruits); alphabetic
        Arrays.fill(fruits, "pineapple ");

        for (int i = 0 ; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }

        System.out.println(" ");

        for (String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
