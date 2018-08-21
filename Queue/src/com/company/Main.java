package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //This is our built in stack in the java;

//        Stack<String> stack = new Stack<>();
//
//        stack.enqueue("hello");
//
//        stack.enqueue("vicky");
//
//        System.out.println(stack);

        Queue queueDemo = new Queue();
        queueDemo.dequeue();
        queueDemo.enqueue(23);
        queueDemo.enqueue(2);
        queueDemo.enqueue(73);
        queueDemo.enqueue(21);
        queueDemo.dequeue();
        queueDemo.dequeue();
        queueDemo.dequeue();
        queueDemo.dequeue();
    }



}
