package ex_21072024;

import java.util.Scanner;

public class Lab_032 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please entre your number and I will give you the factorial of entered number");
        int num = sc.nextInt();
        int fact= 1;

        for (int i=1; i<=num ; i++)
        {
            fact=i*fact;
        }
        System.out.println("Factorial of entered number is: " + fact);
    }
}
