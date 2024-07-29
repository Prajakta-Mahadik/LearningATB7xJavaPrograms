package ex_21072024;

public class Lab_036 {
    public static void main(String[] args) {
        //while loop:

        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }

        int c=1;
        while(i<=5)
        {
            if(c%2==0)
            {
                System.out.println("EVEN NUMBER" + c);
            }
            else
            {
                System.out.println("ODD NUMBER" + c);
            }
            c++;
        }

    }
}
