package com.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("Muaviya");
        queue.add("ABC");
        queue.add("XYZ");

        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        System.out.println("Top element is :" +queue.peek());

        boolean isemptyornot = queue.isEmpty();
        System.out.println(queue);

        System.out.println("Size of queue :" +queue.size());
    }
}
