package ex_21082024_aug.Generic;

public class T2 {

    public static void main(String[] args) {
        TryGeneric<Integer> g= new TryGeneric<Integer>(10);
        System.out.println(g.gen);
        System.out.println(g.run());

    }
}

class TryGeneric <T> {

    T gen;
    public TryGeneric(T gen) {
      this.gen=gen;
    }

    public T run()
    {
        System.out.println("running");
        return null;
    }
}
