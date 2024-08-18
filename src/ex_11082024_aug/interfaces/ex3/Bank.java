package ex_11082024_aug.interfaces.ex3;

public class Bank implements Account,Balance{

    @Override
    public void typeOfAccount() {
        System.out.println("Saving Account");
    }

    @Override
    public void balanceAmount() {
        System.out.println("10000rs");
    }

    void bankDetails()
    {
        typeOfAccount();
        balanceAmount();
        branch();
        availableBal();
        ledgerBal();
    }

    public static void main(String[] args) {
        Bank b= new Bank();
        b.bankDetails();
    }

}
