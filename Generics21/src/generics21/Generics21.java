/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics21;

/**
 *
 * @author seanking
 */
public class Generics21 {
    
    // creating a special method 
    
    //Example of Generic methods
    public static < T extends Comparable <T>> T findMax(T a, T b){
        
        int  n = a.compareTo(b);
        if(n < 0){
            return b;
    }else{
            return a;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));
        
        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("Hello", "there"));
        
       // Generics21 k = new Generics21();
       // System.out.println(findMax("k", "k"));
    }

  
    
}
