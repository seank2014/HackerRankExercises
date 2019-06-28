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
public class Node<D> {
    //Properties
    Node<D> next;
    D data;
    
    // Constructors
    public Node (D newData){
        this.data = newData;
        this.next = null;
    }
    
    public Node(D newData, Node newNext){
        this.data = newData;
        this.next = newNext;
    }
    
    // Getters and Setters
    
    public D getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setData(D newData){
        this.data = newData;
    }
    
    public void setNext( Node newNode){
        this.next = newNode;
    }
    
    
}
