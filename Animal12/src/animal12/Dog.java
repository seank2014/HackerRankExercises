/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal12;

/**
 *
 * @author seanking
 */
public class Dog extends Animal12{
    
    public Dog(){
        super(15);//references superClass
        System.out.println("A Dog has been created");
    }
    
    public void ruff(){
        System.out.println("The dog says ruff");
    }
    
    public void run(){
        System.out.println("A dog is running");
    }
    
    
}
