package ex_20072024;

import java.util.Scanner;

public class Lab_021 {
    public static void main(String[] args) {
        // grade calculator
        //A: 90-100, B: 80-89, C: 70-79, D: 60-69,  F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre your score number:");
        float score = sc.nextFloat();

        if(score>=90 && score<=100)
        {
            System.out.println("Congratulation Your Score Grade is A:" + score);
        }
        else if (score>=80 && score<=89)
        {
            System.out.println("Congratulation Your Score Grade is B:" + score);
        } else if (score>=70 && score<=79)
        {
            System.out.println("Your Score Grade is C:" + score);
        }
        else if (score>=60 && score<=69)
        {
            System.out.println("Your Score Grade is D:" + score);
        }
        else
        {
            System.out.println("You are Failed!!! Your Score Grade is F:" + score);
        }
    }
}
