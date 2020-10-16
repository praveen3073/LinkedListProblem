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

    public void append(GenericNode node) {
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

    public void insert(GenericNode node, GenericNode newNode) {
        GenericNode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public GenericNode pop() {
        GenericNode tempNode = head;
        head = head.getNext();
        return tempNode;
    }
}
