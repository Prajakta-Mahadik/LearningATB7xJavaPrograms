package ex_04082024_aug.SingleInheritance.Example;

public class Lab_049 {
    public static void main(String[] args) {
        Browsers b= new Browsers();
        b.Browsers();

        Google g= new Google();
        g.Google();

        Firefox f= new Firefox();
        f.Firefox();
        f.Browsers();
    }
}
