package ex_10082024_aug.Encap;

public class Lab_053 {
    //fixing of lab 052 issue of encapsulation
    public static void main(String[] args) {
        VWOLogin2 vwoLogin = new VWOLogin2("Prajakta", "praju123");
        System.out.println(vwoLogin.getUserName());
        System.out.println(vwoLogin.getPassword());
        vwoLogin.setPassword("1234");
        System.out.println(vwoLogin.getPassword());
    }
}

class VWOLogin2{
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public VWOLogin2(String userName, String password)
    {
        this.userName=userName;
        this.password=password;
    }

}