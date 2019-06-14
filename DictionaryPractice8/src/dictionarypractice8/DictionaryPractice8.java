/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarypractice8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author seanking
 */
public class DictionaryPractice8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // English to Spanish Dictionary
        // "<>" called carrots
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
        //Putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        //Retrieve things from out dictionary

        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        //Print out all key
        System.out.println(englSpanDictionary.keySet());
        //Print out all values
        System.out.println(englSpanDictionary.values());
        //At this point they are not connected 
        //Print out size of dictionary
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        //Shopping List
        //Map is an interface and HashMap is an implementation
        Map <String, Boolean> shoppingList = new HashMap<String, Boolean>();
        //Put some stuff in dictionary 
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        //Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        // Key-Value Pairs print out
        System.out.println(shoppingList.toString());
        // Is Empty?
        System.out.println(shoppingList.isEmpty());
        //Remove things
        shoppingList.remove("Eggs");
        //Remove value for certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        //Key-Value pairs print out
        System.out.println(shoppingList.toString());     
        //Clear out dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        //Is Empty?
        System.out.println(shoppingList.isEmpty());
    }
    

}
