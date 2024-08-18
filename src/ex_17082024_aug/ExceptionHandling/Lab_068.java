package ex_17082024_aug.ExceptionHandling;

public class Lab_068 {
    public static void main(String[] args) throws ArithmeticException //(throws is like in main method only we are telling
                                                                      // JVM that this code may have exception so pls
                                                                      // handle it by urself )
    {
        int a1=10;
        int a=0;
        try {
            int c= a1/a;
        } catch (Exception e) //Exception is a class , e is variable to store the value of exception we get
        {
            System.out.println("Its Exception : " + e.getMessage());
            throw(e);         //after throw we cant write any statements and it throw catched exception to JVM
                              // and ask JVM only to handle it
        } finally {
            System.out.println("I will call anyways");
        }
    }
}
