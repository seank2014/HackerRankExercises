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
public class Animal12 {
    private int age;
    
    public Animal12(int age){
        this.age = age;
        System.out.println("An animal has been created");
    }
    
    public void eat(){
        System.out.println("An Animal is eating");
    }
    
    public int getAge(){
        return age;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal12 a = new Animal12(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.getAge());
        c.meow();
        System.out.println(c.getAge());
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        
       
    }
    
}
