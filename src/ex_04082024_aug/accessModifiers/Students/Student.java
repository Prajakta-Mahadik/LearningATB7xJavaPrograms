package ex_04082024_aug.accessModifiers.Students;

import ex_04082024_aug.accessModifiers.Teachers;

public class Student {
    public static void main(String[] args) {
        Teachers s = new Teachers("Prajakta");
        s.teaches();
        System.out.println(s.name);

    }

}
