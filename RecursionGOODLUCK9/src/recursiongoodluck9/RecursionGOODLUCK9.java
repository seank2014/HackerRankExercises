/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiongoodluck9;

/**
 *
 * @author seanking
 */


public class RecursionGOODLUCK9 {
    
    public static int Summation(int n){
        ///Base case means we are at the end
        if(n <=0){
            return 0; // additive identity property
        } else{
            //Recursice case means keep going
            return n + Summation(n-1);
        }

}
    
    public static int Factorial(int n){
        //Base case
        if (n <=1){
            return 1;
        } else{
            //Recursive case
            return n * Factorial(n-1);
        }
    }
    
    public static int Exponentiation(int n, int p){
        //Base case
        if(p<=0){ // multiplicative identity
            return n * 1;
        } else
            //Recursive 
        return n * Exponentiation(n, p-1);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Summation(3);
        Factorial(4);
        
        System.out.println(Summation(3));
                System.out.println(Factorial(4));
                System.out.println( Exponentiation(5,4));

    }
    
}
