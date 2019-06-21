/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionspractice16;

/**
 *
 * @author seanking
 */
public class ExceptionsPractice16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            int [] c = new int[6];
            System.out.println("Element 6 at index 5 = " + c[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown" + e);
        }
        finally{
                    System.out.println("Finally clause");

        }
                            //System.out.println("Finally finished try-catch");

    }
    
}
