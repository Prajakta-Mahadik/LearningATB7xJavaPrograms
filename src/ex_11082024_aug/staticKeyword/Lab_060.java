package ex_11082024_aug.staticKeyword;

public class Lab_060 {
    public static void main(String[] args) {
        ATB a= new ATB("Praju","987456123");
        System.out.println(a.getName());
        ATB.doAssignment();
        System.out.println(ATB.courseName);
        System.out.println(a.getPhone());
    }

}

class ATB{
    //IIB-Instance initialization Block
    {
        System.out.println("IIB");
    }

    //static block calling
    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    private String phone;
    static String courseName= "ATB7x Java";

    public ATB(String name, String phone) {
        this.name = name;
        this.phone= phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //static method
    static void doAssignment()
    {
        System.out.println("Doing assignments is compulsory");
    }
}
