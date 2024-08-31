package ex_24082024_aug_CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_074_queues {
    public static void main(String[] args) {
        PriorityQueue pq= new PriorityQueue();
        pq.offer(1);
        pq.offer(9);
        pq.offer(5);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.poll()); //delete top one
        System.out.println(pq);
    }
}
