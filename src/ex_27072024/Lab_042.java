package ex_27072024;

import java.util.Scanner;

public class Lab_042 {
    public static void main(String[] args) {
        int[] marks =new int[3];
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Entre 3 subject marks: ");
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        for(int i =0; i< marks.length; i++)
        {
            System.out.println("Your marks are ->"+ marks[2]);
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
        //sc.close();
    }
}
