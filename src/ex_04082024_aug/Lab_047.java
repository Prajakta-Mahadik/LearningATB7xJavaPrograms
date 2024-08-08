package ex_04082024_aug;

public class Lab_047 {
    public static void main(String[] args) {
        Bank b= new Bank();
        System.out.println(b.bName);
        System.out.println(b.bCode);
        System.out.println(b.balance);

        Bank b1= new Bank("HDFC","HDFC001",100);
        b1.printDetails();

    }
}
