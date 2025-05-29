public class Main {
    public static void main(String[] args) {
        //overload methods = methods that share the same name, but different parameters
        //                   signature = name + parameters

        String pizza = bakePizza("flat bread", "Mozzarella", "pepperoni");

        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String chesse) {
        return chesse + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String chesse, String topping) {
        return topping + " " + chesse + " " + bread + " pizza";
    }
}
