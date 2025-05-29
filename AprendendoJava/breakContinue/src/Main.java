import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // break = break out of a loop (Stop)
        // continue = skip current iteration of a loop (Skip)

        for (int i = 0 ; i <= 20; i++) {

            if(i % 2 == 1 ) {
                continue;
            }

            System.out.printf("%d ", i);
        }
    }
}
