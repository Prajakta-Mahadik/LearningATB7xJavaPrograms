package ex_04082024_aug.accessModifiers;

public class Teachers {
    public String name;
    private long mobNumber;
    protected String address;

    public void teaches()
    {
        System.out.println("Teaching Students a Math subject");
    }

    protected void setPappers()
    {
        System.out.println("Teacher setting the Math Papers for students");
    }

    private void familyDetails()
    {
        System.out.println("Cant see my personal family details");
    }

    public Teachers (String name)
    {
        this.name=name;
    }
}
