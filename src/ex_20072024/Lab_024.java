package ex_20072024;

import java.util.Scanner;

public class Lab_024 {
    public static void main(String[] args) {
        //Calendar program to print month by taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre the number of month from 1 to 12");
        int month =sc.nextInt();
        switch (month){
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Out of Months");
        }
    }
}
