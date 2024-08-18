package ex_17082024_aug;

public interface Lab_063_anonomysClass {
    public static void main(String[] args) {
        //we can create interface and abstract class using anonomys class

        //anonomys class creation to create object of abstract class A
        A a= new A() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        //anonomys class creation to create object of abstract class AAA
        AAA a1= new AAA() {
            @Override
            void m3() {
                System.out.println("m3");
            }
        };
    }

    interface A{
        void m1();
        void m2();
    }

    abstract class AAA{
        abstract void m3();
    }
}
