package com.dubovskiy.concurrent.lists;




import java.util.LinkedList;
import java.util.List;

/**
 * Design an int type singly linkedlist class, and then implement some functions below using the self designed class.
 * Can not use Java built in List interface
 * 1. Append an element into the linkedlist
 * 2. Remove the tail element from a linkedlist
 * 3. Remove all element in the linkedlist that is great than a target value
 */
public class CustomLinkenList {



     private  class Node {
        int item;
        Node next;
        Node prev;

        Node(Node prev, int element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

         @Override
         public String toString() {
             return "Node{" +
                     "item=" + item +

                     '}';
         }
     }

    private Node tail;
    private Node head;

    public void put(int item){
        final Node last = head;
        final Node newNode = new Node(head,item,null);

        if(head == null) {
            tail = head = newNode;
        } else {
           last.next = newNode;
           head = newNode;
        }


    }

    public void removeTail() {
        if (tail == null) throw new IllegalArgumentException("the list is empty");
        final Node next = tail.next;
        if(next == null) head = null;
        tail = next;
    }

    public void removeGreaterThan(int val){

        Node node = tail;

        while (node != null){
          //  System.out.println(node);

            if(val < node.item) {

              final   Node prev = node.prev;
              final   Node next = node.next;

              remove(prev,next);

            }

            node = node.next;
        }
    }

    private void remove(final   Node prev, final   Node next){
        if (prev == null) {
            tail = next;
        }else {
            prev.next = next;
        }

        if(next == null){
            head = prev;
        }else{
            next.prev = prev;
        }


    }

    public void iterate(){

        Node node = tail;

        while (node != null){
            System.out.println(node);
            node = node.next;
        }
    }

    public static void main(String[] args) {

       // LinkedList list = new LinkedList();
        CustomLinkenList list = new CustomLinkenList();

        list.put(555);
        list.put(60);
        list.put( 555);
        list.put( 90);
        list.put( 550);
        list.put( 550);
        list.put( 70);


        list.removeGreaterThan(549);

        list.removeTail();

        list.iterate();



        //System.out.println();


    }

}
