package ex_11082024_aug.interfaces.ex2;

public class Son implements Father,Mother{

    @Override
    public void loan() {
        System.out.println("Son will pay the loan of mother and father");
    }

    @Override
    public void home() {
        System.out.println("My father home");
    }

    public static void main(String[] args) {
        Son n= new Son();
        n.loan();
        n.home();
    }
}
