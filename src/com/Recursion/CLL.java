package com.Recursion;
import java.util.*;
public class CLL {


    /*

    circular linkedlist ,
    In this, nodes are connected in a circular form.

     */

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    /*
    Displaying the content of a linkedlist.
    We have used a do while loop because  there is a condition of printing the condition atleast
    once.
    */

    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.val+" ->");
                node = node.next;
            }
            while (node!=head);
        }
    }
    // inserting at a particular index.
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
    // deleting an element from a linkedlist.

     public void delete(int val) {
        // if the corresponding node becomes equal to the element which you want to delete.
         Node node = head;
         if (node == null) {
             return;
         }
         if (node.val == val) {
             head.next = head;
             tail.next = head;
             return;
         }
         // if the next element of the corresponding node is equal the value which you want to delete.
         do {
             Node n = node.next;
             if (n.val == val) {
                 node.next = n.next;
                 break;
             }
             node = node.next;
         }
         while (node != head) ;
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

