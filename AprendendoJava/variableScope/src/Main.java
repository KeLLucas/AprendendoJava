public class Main {

    static int x = 3; //CLASS

    public static void main(String[] args){
        int x = 1; //LOCAL

        doSomenthing();
        System.out.println(x);
    }
    static void doSomenthing() {

        System.out.println(x);
    }

}
