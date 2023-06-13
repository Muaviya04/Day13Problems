package com.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        int topelement = stack.pop();
        System.out.println("Top Element " +topelement);

        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty);
        System.out.println("Stack size :" +stack.size());
    }
}
