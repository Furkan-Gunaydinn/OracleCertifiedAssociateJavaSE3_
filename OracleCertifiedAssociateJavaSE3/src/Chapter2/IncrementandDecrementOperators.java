package Chapter2;

public class IncrementandDecrementOperators {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;

        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0


    }


}
