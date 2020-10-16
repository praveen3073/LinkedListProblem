package com.linkedlistproblem;

public class GenericLinkedList {
    private GenericNode head;
    private GenericNode tail;

    public GenericLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public GenericNode getHead() {
        return head;
    }

    public void setHead(GenericNode head) {
        this.head = head;
    }

    public GenericNode getTail() {
        return tail;
    }

    public void setTail(GenericNode tail) {
        this.tail = tail;
    }

    public void add(GenericNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }
}
