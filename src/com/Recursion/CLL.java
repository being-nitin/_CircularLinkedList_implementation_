package com.Recursion;
import java.util.*;
public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            tail=node;
            head=node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }






    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
