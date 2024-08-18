package ex_11082024_aug.interfaces.ex3;

public interface Account {

    //complete method is not allowed in interfaces
    void typeOfAccount();

    //only with the static and default keywords we can use complete method in interface.
    static void accountNumber()
    {
        System.out.println("ICICI12345");
    }

    default void branch()
    {
        System.out.println("ICICI VASHI BRANCH");
    }
}
