package ex_14072024;

public class Lab_012 {
    public static void main(String[] args) {
        String name = "Prajakta";   //1 string created in SCP
        System.out.println(name);
        String a = "Testing";
        String b = "Testing";
        System.out.println(a == b); //check reference i.e in which memory this values are present. In SCP it point to existing value.
        System.out.println(a.equals(b)); // check for content i.e testing


        String name1 = new String("Mahadik"); // new operator is used which always create the new string in heap memory even the value is same
        String course_name = new String("Selenium with java");
        String surname =new String("Mahadik");
        System.out.println(name1);
        System.out.println(name1 == surname); // check reference i.e in which memory this values are present.In heap it create the new string doent refer the exisiting
        System.out.println(name1.equals(surname)); // check for content i.e mahadik








    }
}
