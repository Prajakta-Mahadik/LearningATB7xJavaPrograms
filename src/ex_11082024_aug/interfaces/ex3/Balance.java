package ex_11082024_aug.interfaces.ex3;

public interface Balance {

    void balanceAmount();

    default void availableBal()
    {
        System.out.println("1000rs");
    }

    default void ledgerBal()
    {
        System.out.println("100rs");
    }
}
