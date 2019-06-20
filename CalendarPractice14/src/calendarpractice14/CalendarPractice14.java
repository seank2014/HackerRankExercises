/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarpractice14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author seanking
 */
public class CalendarPractice14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
       
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);
        System.out.println(cal.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format.format(cal.getTime());
        System.out.println(formatted);
    }
    
}
