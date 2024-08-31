package ex_21082024_aug.Threads;

public class TH01 {
    public static void main(String[] args) {
        //main is also a thread.
        //Thread is sub process. Process is small program.
        //Thread is a concrete class which extends the runnable interface
        //currentThread is a static native method which is written in some other language ex-c++
        //main thread will start. GC-garbage collector thread will clear everything once program is finished
        // and finalizer thread will close/shut down the threads.
        Thread t = Thread.currentThread();
        for(int i=0; i<=5; i++)
        {
            System.out.println(t.getName()+i + "--"+ t.getPriority()+ "--"+ t.getThreadGroup());
        }
    }
}
