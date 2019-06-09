/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author seanking
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A'; // char is command for Character
    String nameOfCar = "Lucy";
    
    
    public void printVariables(){
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    } // created a method for car
    
   /* public void wreckCar(){
        condition= 'C';
    }*/
    
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Car familyCar = new Car();// instantiate object
        System.out.println("Family Car");
        familyCar.printVariables();
        
       // Car aliceCar = familyCar;
        //familyCar.wreckCar();
       
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
        
      /*  System.out.println("Alice's Car:");
        aliceCar.printVariables();
*/
    }
}
