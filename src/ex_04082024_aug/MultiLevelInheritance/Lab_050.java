package ex_04082024_aug.MultiLevelInheritance;

public class Lab_050 {
    public static void main(String[] args) {
        Father f = new Father();
        f.home();
        f.name();

        Son s = new Son();
        s.home();
        s.name();
        s.name1();

        Daughter d = new Daughter();
        d.home();
        d.name();
        d.name1();
        d.name2();

    }
}
