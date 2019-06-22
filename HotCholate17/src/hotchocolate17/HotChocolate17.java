/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotchocolate17;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author seanking
 */
public class HotChocolate17 {
    
public static final double tooHot = 185;
public static final double tooCold = 160;

public static void drinkHotChocolate(double cocaoTemp) throws TooHotException, TooColdException{
    if(cocaoTemp >= tooHot){
        throw new TooHotException();        
    }else if (cocaoTemp <= tooCold){
        throw new TooColdException();
    }
}

    public static void main(String[] args) throws InterruptedException {
        double currentCocaoTemp = 170;
        boolean wrongTemp = true;
        while(wrongTemp){
        try{
            drinkHotChocolate(currentCocaoTemp);
            System.out.println("That cocoa was good!");
            wrongTemp = false;
        }catch(TooHotException e1){
            System.out.println("THAT's TOO HOT!");
            currentCocaoTemp = (currentCocaoTemp - 5);
        }catch(TooColdException e2){
            System.out.println("THAT'S SO COLD! It's like the artic");
            currentCocaoTemp = currentCocaoTemp + 5;
        }
        TimeUnit.SECONDS.sleep(2); // this delays out put
    }
                System.out.println("And it's gone.");

    }
    
}
