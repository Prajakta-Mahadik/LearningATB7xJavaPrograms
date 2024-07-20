package ex_14072024;

public class Lab_016 {
    public static void main(String[] args) {
        String password = "Praju@123";
        System.out.println(password.charAt(2));
        System.out.println(password.toLowerCase());
        String pass = password.toLowerCase();
        System.out.println(pass);
        System.out.println(pass == password);
        System.out.println(pass.equals(password));
        System.out.println(pass.equalsIgnoreCase(password));
        System.out.println(password.indexOf("1"));
        System.out.println(pass.subSequence(0,5));
    }
}
