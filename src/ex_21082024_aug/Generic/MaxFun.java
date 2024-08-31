package ex_21082024_aug.Generic;

public class MaxFun {
    public static void main(String[] args) {
        System.out.println(maxNum(1.5, 2.0, 9.8));
        System.out.println(maxNum(15, 20, 98));
        System.out.println(maxNum('a','d','z'));
    }

    //Using Generic T for any type of data type can be accepted
    //T is custom class
    public static <T extends Comparable <T>> T maxNum(T a, T b, T c)
    {
        T max=a;

        if(b.compareTo(max) >0 )
        {
            max=b;
        }
        if (c.compareTo(max)>0 )
        {
            max=c;
        }
        return max;
    }

}
