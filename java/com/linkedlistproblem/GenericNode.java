package com.linkedlistproblem;

public class GenericNode <E>{
    private GenericNode next;
    private E data;

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

    public GenericNode(E data) {
        this.next = null;
        this.data = data;
    }
}
