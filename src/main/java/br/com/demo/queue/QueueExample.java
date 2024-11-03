package br.com.demo.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void demonstrarFilas() {
        Queue<String> linkedListQueue = new LinkedList<>();
        Queue<String> priorityQueue = new PriorityQueue<>();

        linkedListQueue.add("Elemento1");
        linkedListQueue.add("Elemento2");
        System.out.println("LinkedList Queue: " + linkedListQueue);

        priorityQueue.add("Elemento1");
        priorityQueue.add("Elemento2");
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
