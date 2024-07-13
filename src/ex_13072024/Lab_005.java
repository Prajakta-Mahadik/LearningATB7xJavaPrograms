package ex_13072024;

public class Lab_005 {
    public static void main(String[] args) {

        byte a= 5;
        byte b= 4;
        String p= "Praju";
        System.out.println(a+b); //9
        System.out.println();
        System.out.println(a-b); //1
        System.out.println();
        System.out.println(a+p); //5Praju
        System.out.println();
        System.out.println(b+p); //4Praju
        System.out.println();
        System.out.println(a+b+p); //9Praju
        System.out.println();
        System.out.println(a-b+p); //1Praju
        System.out.println();
        System.out.println(p+a+b); //Praju54
        System.out.println();
        System.out.println(a+p+b); //5Praju4
        System.out.println();
        System.out.println(a+p+b+a+p+a); //5Praju45Praju5

    }
}
