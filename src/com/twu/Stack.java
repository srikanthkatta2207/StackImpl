package com.twu;

public interface Stack<T> {

    void push(T value);

    void pop();

    int getSize();

    boolean isEmpty();
}
