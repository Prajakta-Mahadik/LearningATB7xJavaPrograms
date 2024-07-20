package ex_20072024;

import java.util.Scanner;

public class Lab_029 {
    public static void main(String[] args) {
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
        Scanner sc =new Scanner(System.in);
        System.out.println("Please entre the length of side1: ");
        float side1 =sc.nextFloat();
        System.out.println("Please entre the length of side2: ");
        float side2 =sc.nextFloat();
        System.out.println("Please entre the length of side3: ");
        float side3 =sc.nextFloat();

        if(side1==side2 && side1==side3)
        {
            System.out.println("It is an Equilateral Triangle");
        }
        else if (side1==side2 || side1==side3)
        {
            System.out.println("It is an Isosceles Triangle");
        }
        else
        {
            System.out.println("It is a Scalene");
        }


    }
}
