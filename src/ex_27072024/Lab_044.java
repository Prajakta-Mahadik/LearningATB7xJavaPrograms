package ex_27072024;

public class Lab_044 {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max = salaries[0];
        for(int i=0; i<salaries.length; i++)
        {
            if(salaries[i]>max)
            {
                max=salaries[i];
            }
        }
        System.out.println(max);
    }
}
