import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //variables
        double firstNum, secondNum, result = 0;
        boolean valid = true;
        char operator;

        // first number
        System.out.print("Enter the first number: ");
        firstNum = scanner.nextDouble();

        // operator
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        // second number
        System.out.print("Enter the second number: ");
        secondNum = scanner.nextDouble();

        // result
        switch(operator){
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if(secondNum == 0) {
                    System.out.println("Cannot divide by 0");
                    valid = false;
                }else
                    result = firstNum / secondNum;
                break;
            case '^':
                result = Math.pow(firstNum, secondNum);
                break;
            default:
                System.out.print("Invalid operator!");
                valid = false;
        }

        if (valid)
            System.out.print(result);

        scanner.close();
    }
}