package ex_10082024_aug.Encap;

public class Lab_056 {
    //main method of class lab_055
    public static void main(String[] args) {
        Lab_055 n= new Lab_055("SBI",100);
        n.getName();
        System.out.println(n.getName());
        n.setName("ICICI");
        System.out.println(n.getName());
        n.getBal();
        System.out.println(n.getBal());
        n.setBal(1000,false);
        System.out.println(n.getBal());
    }
}
