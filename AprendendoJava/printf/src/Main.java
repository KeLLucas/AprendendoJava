public class Main {
    public static void main(String[] args) {

        String name = "SpongeBob";
        char fistLetter = 'S';
        int age = 29;
        double height = 60.3;
        boolean isEmployed = true;

        System.out.printf("Hello %S! 😊\n", name);
        System.out.printf("Your name starts with a %C 👌\n", fistLetter);
        System.out.printf("You are %d years old 👍\n", age);
        System.out.printf("You are %.1f inches tall 🦒\n", height);
        System.out.printf("Employed: %b 🤵‍\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);
    }
}
