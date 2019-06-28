/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice21;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author seanking
 */
public class ArrayPractice21 {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 0 1 2 3 4
        //[0,5,3,2,1] --> length 5
        // 0          1      2 
        //["bob", "bobby", "max"] --> length 3
        //How to initialize arrays
        // 1. Declaring
        Integer[] intArray1;

        // 2. Declaring and Allocation
        Integer[] intArray2 = new Integer[4];

        //printArray();
        // 3. Declaring and Initializing
        Integer[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        // Cant have duplicates in an array
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        //Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();

        //Given Functions
        Arrays.sort(intArray3);
        printArray(intArray3);

        //print string array
        printArray(shoppingList);
        System.out.println();

        System.out.println("Special for loop:");
        // Special for loop foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }

}
