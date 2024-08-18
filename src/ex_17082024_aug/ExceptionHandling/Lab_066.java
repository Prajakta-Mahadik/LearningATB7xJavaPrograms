package ex_17082024_aug.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_066 {
    //Exception is event occurs while running the program and which will disturb the normal flow of
    //program execution

    // 2 type:
    //1-Checked Exception--> JVM knows
    //1-Unchecked Exception--> JVM don't know about the exception
    public static void main(String[] args)  {

        try {
            FileInputStream f= new FileInputStream("C:/Users/AP-1058/Documents/");
        } catch (FileNotFoundException e)
        {
            System.out.println("File Not found please pass proper file path");
        }

        try {
            int a= 10;
            int b= a/0;  //ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Divided by 0 not supported please divide by any positive number except 0");
        }
        System.out.println("End of Program");

    }

}
