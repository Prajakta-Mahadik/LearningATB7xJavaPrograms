package ex_14072024;

public class Lab_010 {
    public static void main(String[] args) {
        //Type Casting : Implicit(Widening) and Explicit(Narrowing)

        //Implicit:
        byte a= 5;
        int b= a;  //implicit calling JVM understand automatically
        System.out.println(b);
        int c=(int)a;  //Explicit calling forcefully
        System.out.println(c);

        int d= 300;
        byte f=(byte)d; //first 300 converted to binary code and then byte have 8bits of storage so from right only 8 digit(covert into digits) and its 44 and rest all loss
        System.out.println(f); // output 44

        float p= 3.14f;
        int m= (int)p;
        System.out.println(m); //explicit calling to 3.14 will loss values after 3 digit
        double n=p;
        System.out.println(n); //Implicit calling to 3.14 complete value will get

        long phone_no = 8767496061L;
        short s = (short) phone_no;
        System.out.println(s);


    }
}
