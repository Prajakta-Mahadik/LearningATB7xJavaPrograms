package ex_21082024_aug.Threads;

public class TH02 {
    //main is also one thread
    public static void main(String[] args) throws Exception {
        Hi h= new Hi();
        h.start();
        Thread.sleep(500);// bcoz of this hi will print then after half sec hello will be print by JVM

        Hello h1= new Hello();
        h1.start();

        Thread t= Thread.currentThread(); //thread is concrete class
                                          //currentThread is static native method which is written in other lang.
            for(int i=1; i<=2;i++)
            {
                System.out.println("Multithreading concepts "+ t.getThreadGroup()+ t.getPriority()+ t.getName()); //main thread work
            }
    }
}

class Hi extends Thread    //thread 1 work //thread has 2 in-build functions: run() and start() in which start call the run() method
{
    @Override
    public void run() {
        try{
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            Thread.sleep(1000);
        }
        }
        catch (InterruptedException i)
        {
            System.out.println("InterruptedException Occurs");
        }
    }
}

class Hello extends Thread   //thread 2 work
{
    @Override
    public void run() {
        try{
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            Thread.sleep(1000);
        }
        }
        catch (InterruptedException i)
        {
            System.out.println("InterruptedException Occurs");
        }
    }
}