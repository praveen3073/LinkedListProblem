package com.linkedlistproblem;

public class GenericNode<E extends Comparable> {
    private GenericNode next;
    private E data;

    public GenericNode(E data) {
        this.next = null;
        this.data = data;
    }

    public GenericNode getNext() {
        return next;
    }

    public void setNext(GenericNode next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
