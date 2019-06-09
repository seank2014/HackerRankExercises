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

    //Intstance variables
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A'; // char is command for Character
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    //Constructor has to match name of the class
    //f(x) = x + 1;
    //say x = 5;
    //f(5) = 5 + 1 = 6;
    public Car() {

    }

    //Getters and Setters
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {

        //same this as numberOfPeopleInCar = numberOfPeopleInCar + 1;
        //if there arent too many people in the car
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            //then someone can get int
            numberOfPeopleInCar++;
            System.out.println("Someone got in");

        } else {
            //otherwise print out the fact the car is full
            System.out.println("The car is full!" + numberOfPeopleInCar + "= " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        // numberOfPeopleInCar = numberOfPeopleInCar - 1;
        //if there is people in the car
        if (this.numberOfPeopleInCar > 0) {
            // then tell one person to get out
            numberOfPeopleInCar--;
        } else {
            // otherwise no one can get out and we'll print that.
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }

    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        //if the car isnt on
        if (!isTheCarOn) {
//turn it on
            isTheCarOn = true;
        } else {
            //otherwise print out the fact that it's on
            System.out.println("Car is already on + " + isTheCarOn);
        }

    }

    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
    }
}
