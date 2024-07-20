package ex_20072024;

import java.util.Scanner;

public class Lab_025 {
    public static void main(String[] args) {
        // vowel print by if and switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre the letter and i will tell you its vowel or consonant:");
        char vowels = sc.next().charAt(0);
        //using switch
        switch (vowels){
            case 'a':
                System.out.println("Its Vowel");
                break;
            case 'e':
                System.out.println("Its Vowel");
                break;
            case 'i':
                System.out.println("Its Vowel");
                break;
            case 'o':
                System.out.println("Its Vowel");
                break;
            case 'u':
                System.out.println("Its Vowel");
                break;
            default:
                System.out.println("Its consonant");
        }

        //using if else:
        if(vowels == 'a' || vowels == 'e' || vowels == 'i'|| vowels == 'o'|| vowels == 'u')
        {
            System.out.println("Its an Vowels");
        }
        else
        {
            System.out.println("Its consonant");
        }
    }
}
