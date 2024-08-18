package ex_11082024_aug.exLoan;

abstract class FatherLoan {

    //we cant create an objects for abstract class
    // abstract method have abstract class

    abstract void loan50Lakh();
    void loan20Lakh()
    {
        System.out.println("Loan of 20 Lakhs is paid");
    }
}
