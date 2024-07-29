package ex_21072024;

public class Lab_039 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++)
        {
            for (int j=5; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
