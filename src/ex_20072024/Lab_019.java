package ex_20072024;

import java.util.Scanner;

public class Lab_019 {
    public static void main(String[] args) {
        //will define variable value
        int a =135;
        if(a%2==0){
            System.out.println("a is an even number!");
        }
        else{
            System.out.println("a is an odd number!");
        }

        // Will take input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre your number:");
        int input_value = sc.nextInt();
        if(input_value%2==0){
            System.out.println("Entered number is even number");
        }
        else{
            System.out.println("Entered number is odd number");
        }
    }
}
