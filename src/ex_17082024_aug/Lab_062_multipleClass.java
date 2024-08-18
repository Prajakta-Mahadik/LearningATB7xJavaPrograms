package ex_17082024_aug;

public class Lab_062_multipleClass {
    public static void main(String[] args) {

    }
    class ABC{
        Integer a=60; //Instance variable

        void mark()
        {
            System.out.println(a);
            //System.out.println(b); cnt access sub class variable in main class
        }

        class CDE{
            Integer b= 90; //local variable

            void make()
            {
                System.out.println("Making");
                System.out.println(a); //we can use main class variable in sub class
            }
        }

    }
}
