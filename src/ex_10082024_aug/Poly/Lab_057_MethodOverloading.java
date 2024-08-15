package ex_10082024_aug.Poly;

public class Lab_057_MethodOverloading {

    //MethodOverloading | static | compile_time_poly

    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    String add(String a, String b)
    {
        return a+b;
    }

    String add(String a, int b)
    {
        return a+b;
    }

    String add(int b, String a)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Lab_057_MethodOverloading a= new Lab_057_MethodOverloading();
        int result= a.add(5,4);
        System.out.println(result);
        int result1= a.add(2,2,2);
        System.out.println(result1);
        String result2= a.add("Prajakta","Shinde");
        System.out.println(result2);
        String result3=a.add("Prajakta",1995);
        System.out.println(result3);
        String result4= a.add(1995,"Prajakta");
        System.out.println(result4);

    }

}
