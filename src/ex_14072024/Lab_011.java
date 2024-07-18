package ex_14072024;

public class Lab_011 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
       /* int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);
        System.out.println(a++ + a);*/

        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int b = 10;
        System.out.println(b++ + ++b);
        System.out.println(b);

    }
}
