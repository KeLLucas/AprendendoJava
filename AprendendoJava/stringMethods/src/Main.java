import java.beans.PropertyEditorManager;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        /*
        String name = "Kelvim Lucas de Paula";

        int length = name.length(); // length of string include spaces

        char letter = name.charAt(0); // what is letter in this position

        int index = name.indexOf('m');  // position letter

        int lastIndex = name.lastIndexOf('l');

        name = name.toLowerCase();

        name = name.trim(); // exclude spaces before and lather

        name = name.replace("a", "i");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("k"));
        System.out.println(name.equalsIgnoreCase("paula"));
        */

        // .substring() = A method used to extract a portion of a string.
        // .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email, username, domain;

        System.out.println("Enter your email: ");
        email = scanner.nextLine();

        scanner.close();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@') + 1);

            System.out.println(username);
            System.out.println(domain);
        }

    }
}

