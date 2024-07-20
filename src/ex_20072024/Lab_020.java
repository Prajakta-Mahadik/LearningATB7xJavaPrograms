package ex_20072024;

import java.util.Scanner;

public class Lab_020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre first number");
        int first_number = sc.nextInt();
        System.out.println("Please entre second number");
        int second_number = sc.nextInt();
        System.out.println(Math.max(first_number,second_number));
        System.out.println("Please entre third number");
        int third_number = sc.nextInt();
        if(first_number>=second_number && first_number>=third_number)
        {
            System.out.println("Entered first number is largest:" + first_number);
        }
        else if (second_number>=first_number && second_number>=third_number)
        {
            System.out.println("Entered second number is largest:" + second_number);
        }
        else
        {
            System.out.println("Entered third number is largest:" + third_number);
        }

    }
}
