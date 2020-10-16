package com.linkedlistproblem;

public class GenericSortedLinkedList {
    private GenericNode head;
    private GenericNode tail;

    public GenericSortedLinkedList() {
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

    public void add(GenericNode newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            GenericNode tempNode = head;
            while (tempNode != null) {
                if (tempNode.getData().compareTo(newNode.getData()) <= 0 &&
                        tempNode.getNext() == null) {
                    tempNode.setNext(newNode);
                    tail = newNode;
                    break;
                } else if (tempNode.getData().compareTo(newNode.getData()) <= 0 &&
                        tempNode.getNext().getData().compareTo(newNode.getData()) > 0) {
                    newNode.setNext(tempNode.getNext());
                    tempNode.setNext(newNode);
                    break;
                } else if (tempNode.getData().compareTo(newNode.getData()) > 0 &&
                        tempNode.getNext() == null) {
                    newNode.setNext(tempNode);
                    head = newNode;
                    break;
                } else
                    tempNode = tempNode.getNext();
            }
        }
    }

    public void printList() {
        GenericNode tempNode = head.getNext();
        System.out.print(head.getData());
        while (tempNode != null) {
            System.out.print(" -> " + tempNode.getData());
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }
}
