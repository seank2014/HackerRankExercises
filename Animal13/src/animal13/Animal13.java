/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal13;

/**
 *
 * @author seanking
 */
public abstract class Animal13 {
    private int age;
    
    public Animal13(int age){
        this.age = age;
        System.out.println("An animal has been created");
    }
    
    public abstract void eat();
    
    public void sleep(){
        System.out.println("An animal is sleeping");
    }
    
    public int getAge(){
        return age;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog d = new Dog();
        Cat c = new Cat();
        c.eat();
        d.eat();
        d.sleep();
        c.sleep();
        
        //Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();
        
        Object str = "test";
        String realS = (String) str;
        realS.getBytes();
        
        //What happens when...
//        Dog doggy = new Dog();
//        if(doggy instanceof Animal){
//        Animal animal = (Animal) doggy;
//       
//    }
       
    }
    
}
