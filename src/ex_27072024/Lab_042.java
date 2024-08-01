package ex_27072024;

import java.util.Scanner;

public class Lab_042 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner sc= new Scanner(System.in);
        System.out.println("Please entre first number");
        marks[0]= sc.nextInt();
        System.out.println("Please entre second number");
        marks[1]=sc.nextInt();
        System.out.println("Please entre third number");
        marks[2]=sc.nextInt();

        for(int i =0; i< marks.length; i++)
        {
            System.out.println(i + "Your marks are i index->"+ marks[i]);
        }

       int[] num = {10,20,30,40};
        for(int i =0; i <num.length; i++)
        {
            System.out.println(num[i] * 10);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 2);
        }

        int[] a= new int[4];
        a[2]=99;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        sc.close();
    }
}
