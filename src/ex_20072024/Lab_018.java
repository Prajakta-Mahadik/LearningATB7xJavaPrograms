package ex_20072024;

public class Lab_018 {
    public static void main(String[] args) {
        //1st program
        boolean n = !false;
        if(n) {
            System.out.println("n is true!!");
        }
        else{
            System.out.println("n is false!!");
        }
      //2nd program
        double d =8;
        if(d ==3.14)
        {
            System.out.println("Its Pie Value");
        }
        else{
            System.out.println("Its not a Pie value");
        }
        //3rd program
        boolean a =true;
        a= !a;
        if(2*2 < 5) {
            System.out.println("Inside Loop");
               }
        else {
            System.out.println("Outside the Loop." + a);
        }
    }
}
