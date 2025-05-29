public class Main {
    public static void main(String[] args){

        // && = AND
        // || = OR
        // ! = NOT

        double temp = 20;
        boolean isSunny = true;

        if (temp <= 40 && temp >= 0 && isSunny){
            System.out.println("The weather is good! 🌤️");
            System.out.println("It is sunny outside! ☀️");
        } else if (temp <= 40 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good! 🌤️");
            System.out.println("It is cloudy outside! ⛅");
        }
    }
}
