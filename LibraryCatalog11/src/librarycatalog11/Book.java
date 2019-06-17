/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalog11;

/**
 *
 * @author seanking
 */
public class Book {
    
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //wheather or not it is checked out
    int dayCheckedOut = -1;
    
    //constructor
    //Remember constructors must be capitalized
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
        
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public String getTitle(){
        return this.title;
    }
    
    public boolean isIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }
    
       public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    
     
        private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
    
    
   
}
