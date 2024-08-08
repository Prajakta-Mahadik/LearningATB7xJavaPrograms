package ex_04082024_aug.accessModifiers;

public class Principal {
    public static void main(String[] args) {
        Teachers p = new Teachers("Prajakta");
        p.teaches();
        p.setPappers();
        System.out.println(p.name);
    }
}
