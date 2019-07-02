/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimepractice25;

import java.util.HashMap;

/**
 *
 * @author seanking
 */
public class RunTimePractice25 {
    
      public static int findNumberOfRepetitions(String s, char c){
          // Linear time; O(n) time
          int sum = 0;
          for(int i=0; i < s.length(); i++){
              if(s.charAt(i) == c){
                  sum++;
              }
          }
          return sum;
        }
      
      /* this is a brute force method because we check every possible outcome without
      even though it is not necessary
      */
      public static int[] findNumsOfRepetitionsv1(String s, char[] c){
          //Quad time: O(n * m) time (O notation as is "over". time is not going to be "over n")
          int[] sums = new int[c.length]; // runtime -> contant  so 1
          for(int i = 0; i < s.length(); i++){ // runtime ->  1, n+1, 1 (n refers to the length of input)
              for(int j = 0; j < c.length; j++){ //n,   n*m + 1, n*m
                  if(s.charAt(i) == c[j]){ // n*m
                      sums[j] = sums[j] + 1; // n*m
                  }
              }
          }
          return sums; // 1
      }
      
      public static int[] findNumsOfRepetitionsv2(String s, char[] c){
          // Optimal time: O(n+m)
          int[] sums = new int[c.length]; // 1
          HashMap<Character, Integer> map = new HashMap<>();
          for(int i= 0; i < s.length(); i++){
              if(!map.containsKey(s.charAt(i))){
                  map.put(s.charAt(i), 1);
              }else{
                  int sum = map.get(s.charAt(i));
                  map.put(s.charAt(i), sum + 1);
              }
          }
         for (int j = 0; j < c.length; j++){
             int sum;
             if(!map.containsKey(c[j])){
                 sums[j] = 0;
             } else{
                 sums[j] = map.get(c[j]);
             }
             
         }
         
         return sums;
          
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        long startTime = System.currentTimeMillis(); //setting timer
        System.out.println(findNumberOfRepetitions("abca", 'a'));
       long endTime = System.currentTimeMillis();
       long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
        
        char [] a = {'a', 'b'};
        
        startTime = System.currentTimeMillis(); //setting timer
        System.out.println(findNumsOfRepetitionsv1("oajdooDOmsdoemoxmojeifhinincalcaincsiialncxidnansacxacianbdinccadilcancncsiancdianc", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
        
        startTime = System.currentTimeMillis(); //setting timer
        System.out.println(findNumsOfRepetitionsv2("oajdooDOmsdoemoxmojeifhinincalcaincsiialncxidnansacxacianbdinccadilcancncsiancdianc", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
    
}
