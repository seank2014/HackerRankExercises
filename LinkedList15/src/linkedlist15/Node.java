/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist15;

/**
 *
 * @author seanking
 */
public class Node {
    //Properties
    Node next;
    int data;
    
    // Constructors
    public Node (int newData){
        this.data = newData;
        this.next = null;
    }
    
    public Node(int newData, Node newNext){
        this.data = newData;
        this.next = newNext;
    }
    
    // Getters and Setters
    
    public int getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setData(int newData){
        this.data = newData;
    }
    
    public void setNext( Node newNode){
        this.next = newNode;
    }
    
    
}
