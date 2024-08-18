package ex_17082024_aug.ExceptionHandling;

public class Lab_067 {
    public static void main(String[] args) {
        try {
            String s= args[0]; //this getting from 3dots-->edit-->CLI argument
            int a= 10/0;
        } catch (Exception e) // Exception e=new Exception();
         {
            System.out.println("Their is some problem with the code");
            System.out.println(e.getMessage());
        }
    }
}
