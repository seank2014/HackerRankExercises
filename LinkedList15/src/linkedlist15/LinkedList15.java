/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist15;

import java.util.LinkedList;

/**
 *
 * @author seanking
 */
public class LinkedList15 {

    /**
     * @param args the command line arguments
     */
    
    // Properties
    
    Node head;
    int count;
    
    // Constructors
    
//    public LinkedList15(){
//        this.head = null;
//        this.count = 0;
//    }
    
    public LinkedList15(Node newHead){
        this.head = newHead;
        this.count = 1;
    }
    
    // Methods
    
    //add
    
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    //get
    public int get(int index){
        if(index<= 0){
            return -1;
        }
        
        Node current = head;
        for(int i =1; i < index; i++){
            current = current.getNext();
        }
        
        return current.getData();
    }
    
    //size
    public int size(){
        return count;
        
    }
    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }
    //remove
    
    public void remove(){
        //remove the back of the list
        Node current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicey");
        System.out.println(linkedList);
    }
    
}
