package com.twu;

public final class Stacks {

    public static <T> Stack<T> createStack() {
        return new LinkedListStackBasedImpl<T>();
    }

    private Stacks() {}
}
