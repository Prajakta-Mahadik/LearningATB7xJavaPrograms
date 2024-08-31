package ex_24082024_aug_CollectionFramework;

import java.util.Stack;

public class Lab_069_stacks {
    public static void main(String[] args) {
        //Stack is legacy class. Its same as vectors. Synchronised bcoz of this it is slow and time-consuming.
        //initial size cant set. Internally uses array. get value by index
        Stack<String> s= new Stack<>();
        s.push("Pramod");
        s.push("Dutta");
        s.add("Dinesh");
        s.push("Sam");
        System.out.println(s);
        System.out.println(s.pop()); //delete top one
        System.out.println(s);
        s.push("Ram"); //insert something on top
        System.out.println(s);
        System.out.println(s.peek()); //gives who is at the top
        System.out.println(s.search("Pramod"));
    }
}
