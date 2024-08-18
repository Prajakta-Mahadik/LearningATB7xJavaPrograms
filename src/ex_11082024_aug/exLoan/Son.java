package ex_11082024_aug.exLoan;

public class Son extends FatherLoan {
    //Son is concrete class bcoz abstract class or method is not there
    //only for concrete class we can create an objects
    //we cant create an objects for abstract class
    // abstract method have abstract class
    @Override
    void loan50Lakh() {
        System.out.println("I will pay the loan of 50 Lakhs");
    }

    public static void main(String[] args) {
        Son s= new Son();
        s.loan50Lakh();
        s.loan20Lakh();

        FatherLoan f= new Son();  //Dynamic Dispatch
        f.loan20Lakh();
        f.loan50Lakh();
        }
    }
