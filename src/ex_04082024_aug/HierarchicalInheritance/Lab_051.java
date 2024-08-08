package ex_04082024_aug.HierarchicalInheritance;

public class Lab_051 {
    public static void main(String[] args) {
        //GF ACCESS OWN LAND
        new GrandFather().land(); //other type write object
                                 // syntax: GrandFather f= new GrandFather();
                                 // f.land();

        //FATHER CAN ACCESS HIS OWN AND GF LAND
        new Father().land();
        new Father().land1();

        //UNCLE CAN ACCESS HIS OWN AND GF LAND
        new Uncle().land();
        new Uncle().land2();


    }
}
