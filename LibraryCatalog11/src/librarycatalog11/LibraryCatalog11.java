/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalog11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author seanking
 */
public class LibraryCatalog11 {
    
    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialFeeLateFee = 0.50;
    double feePerLateDay = 1.00;
    
    public LibraryCatalog11(Map<String, Book> collection){
        this.bookCollection = collection;   
    }
    
    public LibraryCatalog11(Map<String, Book> collection, int lengthOfCheckoutPeriod, 
            double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialFeeLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;     
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }
    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialFeeLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    public void nextDay(){
        currentDay++;
    }
    
    public void setDay(int day){
        currentDay = day;
    }
    
    public void checkOutBook(String title){
        Book book = getBook(title);
        if(book.isIsCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " +
                    (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }
    
    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if(daysLate > 0){
            System.out.println("You owe the library $ " + (getInitialLateFee() + daysLate * getFeePerLateDay()) +
                    " because your book is " + daysLate + " days overdue");
        } else {
            System.out.println("Book Returned. Thank you");
        }
        
        book.setIsCheckedOut(false, -1);
    }
        
    
    
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. " 
        + "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
}
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter", 827132, 99999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalog11 lib = new LibraryCatalog11(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
        
        
    }
    
}
