package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack theStack = new Stack(3);   //size is passed here only;
        theStack.push(10); theStack.display();
        theStack.push(20); theStack.display();
        theStack.push(30); theStack.display();
        theStack.push(40); theStack.display();
        theStack.push(50);theStack.display();

        theStack.display();
    }
}
