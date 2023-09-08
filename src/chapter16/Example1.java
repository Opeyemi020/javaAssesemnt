package chapter16;

import java.util.LinkedList;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {

        //Queue using the ArrBlockingQueue -> we are using the add
        // We can use the LinkList if we need to use the offer
        // can also use the priorityQueue // it has a constructor that takes in comparator
        //Other method to perform setting operation - peek : shows the element in the front of the queue
        //poll will remove and *(return) the front item or the element that it remove

        Queue<Candidate> candidates = new LinkedList<>();

        candidates.offer(new Candidate("Asiwaju","APC"));
        candidates.offer(new Candidate("chimezie","OPC"));
        candidates.offer(new Candidate("Sultan yungidu","APC++"));
        candidates.offer(new Candidate("Rabiu Kwankwaso","NNPP"));
        candidates.offer(new Candidate("Peter Obi","LPC"));
        candidates.offer(new Candidate("Atiku","PDP"));

        System.out.println("Before::" + candidates);

        System.out.println(candidates.peek());

        candidates.poll();

        System.out.println("After::" + candidates);
    }
}
