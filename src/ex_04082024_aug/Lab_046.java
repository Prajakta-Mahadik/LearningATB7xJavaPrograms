package ex_04082024_aug;

public class Lab_046 {
    public static void main(String[] args) {
        ATB7Batch b= new ATB7Batch();
        System.out.println(b.name);

        ATB7Batch b1=new ATB7Batch("Prajakta");
        System.out.println(b1.name);

        ATB7Batch b2=new ATB7Batch("Pooja",776548903);
        System.out.println(b2.name);
        System.out.println(b2.mobile_number);

    }
}
