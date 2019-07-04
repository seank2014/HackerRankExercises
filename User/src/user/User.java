/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author seanking
 */
public class User {
    
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs){
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Set a = new HashSet();
        a.add(1212);
        
        User sean = new User("kingCook", "MiniMe", 25, a);
    }
    
}
