package ex_04082024_aug;

public class Bank {
    String bName;
    String bCode;
    int balance;

    //Default constructor
    Bank()
    {
        bName="SBI";
        bCode="SBI001";
        balance=1000;
    }

    //Parameterised constructor
    Bank(String bName1, String bCode1, int balance1)
    {
        this.bName=bName1;
        this.bCode=bCode1;
        this.balance=balance1;
    }

    void printDetails()
    {
        System.out.println("Bank Name is -> " + bName);
        System.out.println("Bank IFSC code is -> " + bCode);
        System.out.println("Bank balance is -> " + balance);
    }
}
