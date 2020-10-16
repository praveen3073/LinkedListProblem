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

    public <E> void insert(E dataValue, GenericNode newNode) {
        GenericNode tempNode = getNode(dataValue);
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }

    public GenericNode pop() {
        GenericNode tempNode = head;
        head = head.getNext();
        return tempNode;
    }

    public GenericNode popLast() {
        GenericNode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        tail = tempNode;
        tempNode = tempNode.getNext();
        tail.setNext(null);
        return tempNode;
    }

    public <E> GenericNode getNode(E dataValue) {
        GenericNode tempNode = head;
        while (tempNode != null) {
            if (tempNode.getData().equals(dataValue))
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }
}
