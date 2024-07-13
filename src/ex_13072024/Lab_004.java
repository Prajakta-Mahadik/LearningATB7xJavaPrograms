package ex_13072024;

import java.sql.SQLOutput;

public class Lab_004 {
    public static void main(String[] args) {
        byte _123 = 101;
        System.out.println(_123);

        //formatting
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        int a =10;
        System.out.printf("You age is -> %d",a );
        System.out.println("\n");
        String surname = "Mahadik";
        System.out.printf("My surname is %s", surname);
        System.out.println("\n");
        char p= 'm';
        System.out.printf("this is character -> %c", p);
        System.out.println("\n");
        float x = 3.14f;
        System.out.printf("This is pie value %f", x);

    }
}
