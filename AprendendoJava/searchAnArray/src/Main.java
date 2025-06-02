import java.util.SortedMap;

public class Main {
    public static void main(String[] args){

        int[] numbers = {1, 9, 2, 4, 6 ,8, 3};
        int target = 2;
        boolean isFound = false;

        String[] fruits = {"banana", "apple", "melon"};
        String targetFruit = "apple";

        for(int i = 0; i < numbers.length; i++){
            if (target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in the array.");
        }

        for(int i = 0; i < fruits.length; i++){
            if (fruits[i].equals(targetFruit)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in the array.");
        }

    }
}
