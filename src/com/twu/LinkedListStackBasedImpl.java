package com.twu;

import java.util.LinkedList;

public class LinkedListStackBasedImpl<T> implements Stack<T> {

    private LinkedList<T> backingList = new LinkedList<T>();

    @Override
    public void push(T value) {
        backingList.add(value);
    }

    @Override
    public void pop() {
        backingList.remove();
    }

    @Override
    public int getSize() {
        return backingList.size();
    }

    @Override
    public boolean isEmpty() {
        return backingList.isEmpty();
    }
}
