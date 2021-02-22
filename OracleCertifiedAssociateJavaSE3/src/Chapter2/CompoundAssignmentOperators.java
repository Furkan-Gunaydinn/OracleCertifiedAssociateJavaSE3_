package Chapter2;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {


    /*x=x*z;
    x*=z;
    long x =10;
    int y =5;
    y =y *x;
    */


        int x = 10, y = 20, z = 10;
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= z);
        System.out.println(x > z);


        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }

        int o = 0;
        do {
            o++;
        } while (false);
        System.out.println(x); // Outputs 1

        String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", ");
        }

        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", ");
        }

        names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", ");
        }

        java.util.List<String> valuess = new java.util.ArrayList<String>();
        valuess.add("Lisa");
        valuess.add("Kevin");
        valuess.add("Roger");
        for(String value : valuess) {
            System.out.print(value + ", ");
        }

    }

}