package com.twu;

public class Main {

    public static void main(String[] args) {
        Stack stack = Stacks.createStack();

        stack.push(4);
        stack.push(10);
        stack.push(13);
        stack.push("srikanth");


        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());
    }
}
