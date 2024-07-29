package ex_21072024;

public class Lab_031 {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i<=-10; i++)
        {
            System.out.println(i);
        }

        //even odd number by for loop
        for(int i=1; i<=10; i++)
        {
         if(i%2==0)
         {
             System.out.println("Its an Even Number: " + i);
         }
         else
         {
             System.out.println("Its odd number: "+ i);
         }
        }
    }
}
