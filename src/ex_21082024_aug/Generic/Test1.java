package ex_21082024_aug.Generic;

public class Test1 {

    //static function with parameter. <T> is generic which can accept any datatype entered by user
    public static <T> void t1(T a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        t1(1.5);
        t1(5);
        t1('D');
        t1("Praj");
    }
}


