import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {"De quem é a famosa frase “Penso, logo existo”?", "Qual é a capital do Brasil?"};
        String[][] respostas = {{"1. Platão", "2. Galileu Galilei", "3. Descartes"},
                {"1. São Paulo", "2. Rio de Janeiro", "3. Brasília", "4. Sorocaba"}};

        int[] certos = {1, 2};
        int guess;
        int score = 0;

        System.out.println("**********************************************");
        System.out.println("*             Welcome to the quiz            *");
        System.out.println("**********************************************");

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);

            for(String resposta : respostas[i]) {
                System.out.println(resposta);
            }
            System.out.print("Resposta: ");
            guess = scanner.nextInt();

            if (guess == certos[i]){
                System.out.println("Certa Resposta");
                score++;
            }else {
                System.out.println("Errou!");
            }
            System.out.println();
        }
        System.out.printf("Você acetou %d de %d", score, perguntas.length);
    }
}
