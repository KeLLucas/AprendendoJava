import java.util.Random;
import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args) {
        Random random = new Random();
        DecimalFormat dc = new DecimalFormat("0.#");

        for (int i = 0; i < 10; i++ ){
            System.out.println(dc.format(random.nextDouble(1, 10.1)));
        }
    }
}
