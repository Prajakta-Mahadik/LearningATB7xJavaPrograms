package ex_21082024_aug.Threads;

public class TH03 {
    public static void main(String[] args) {
        Hey a= new Hey();
        Thread t= new Thread(a);
        t.setName("Thread 01");
        System.out.println(t.getName()+" "+t.getPriority()+ " " +t.getThreadGroup());
        t.setPriority(2);
        System.out.println(t.getPriority());
        t.start();
    }
}

class Hey implements Runnable //runnable is an interface
{
    @Override
    public void run() {
        try
        {
            for (int i=1; i<=2; i++)
            {
                System.out.println("Hey, its multithreading with implementing an interface");
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
    }
}
