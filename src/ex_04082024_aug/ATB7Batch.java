package ex_04082024_aug;

public class ATB7Batch {
    String name;
    long mobile_number;

    ATB7Batch()
    {
        System.out.println("New Batch started from JULY 2024");
    }

    ATB7Batch(String givenName)
    {
        this.name= givenName;
    }

    ATB7Batch(String nameGiven,long phoneNumber)
    {
        this.name = nameGiven;
        this.mobile_number = phoneNumber;
    }

}
