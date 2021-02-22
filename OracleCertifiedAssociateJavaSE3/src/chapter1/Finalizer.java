package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {
    private static List objects = new ArrayList();


    protected void finalize() {
        System.out.println("Calling finalize");
        objects.add(this); // Don't do this
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}



