package ex_20072024;

import java.util.Scanner;

public class Lab_028 {
    public static void main(String[] args) {
        //Leap Year program: year should be completely divisible 4 and 400. reminder should be 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Entre Your Year: ");
        long user_year = sc.nextLong();
        if (user_year%4==0 && user_year%400==0)
        {
            System.out.println("Entered Year is Leap Year");
        }
        else
        {
            System.out.println("Entered Year is not a Leap Year");
        }
    }
}
