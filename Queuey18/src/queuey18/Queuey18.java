/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuey18;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author seanking
 */
public class Queuey18 {

    LinkedList queue;

    //Making a queue instance
    public Queuey18() {
        queue = new LinkedList();
    }

    //Is our queue empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //What is the size of out queue?
    public int size() {
        return queue.size();
    }

    //Enqueing an item
    public void enqueue(String n) {
        queue.addLast(n);
    }

    //Dequeueing an item
    public String dequeue() {
        /*Example of casting*/
        return (String) queue.remove();
    }

    public String peek() {
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        //Good to practice add an array type to the your data structure so we know it only has one type and 
        //what that type is
        Stack<String> stackey = new Stack<>();
        stackey.push("there");
        stackey.push("hi");
        System.out.print(stackey.pop() + " ");
        System.out.println("Peek:" + stackey.peek());
        System.out.print(stackey.pop() + "! ");
        System.out.println(stackey.size());
      

//        Queuey18 stringQueue = new Queuey18();
//        stringQueue.enqueue("hi");
//        stringQueue.enqueue("there");
//        System.out.print(stringQueue.dequeue() + " ");
//        System.out.print(stringQueue.dequeue() + " ");
//
//        Queuey18 numberOne = new Queuey18();
//        numberOne.enqueue(5);
//        numberOne.enqueue(7);
//        numberOne.enqueue(6);
//        System.out.println("First out: " + numberOne.dequeue());
//        System.out.println("Peek at second item: " + numberOne.peek());
//        System.out.println("First out: " + numberOne.dequeue());
//        System.out.println("First out: " + numberOne.dequeue());
    }

}
