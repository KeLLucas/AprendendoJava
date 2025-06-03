public class Main {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"onions", "potato", "carrot"};
        String[] meats = {"chicken", "pork", "beef"};

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"onions", "potato", "carrot"},
                                {"chicken", "pork", "beef"}};

        groceries [0][0] = "pineapple";
        groceries [1][0] = "celery";


        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        // tel display

        char[][] telephone =    {{'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'#', '0', '*'}};

        for (char[] display : telephone){
            for (char numbers : display){
                System.out.print(numbers + " ");
            }
            System.out.println();
        }
    }
}
