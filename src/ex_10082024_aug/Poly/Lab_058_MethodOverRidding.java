package ex_10082024_aug.Poly;

public class Lab_058_MethodOverRidding {

    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();

        Pug p= new Pug();
        p.bark();

        Dog f= new Pug();
        f.bark();
    }
}
