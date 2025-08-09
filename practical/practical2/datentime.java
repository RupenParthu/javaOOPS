package practical.practical2;

import java.util.Date;

public class datentime {
    public static void main(String args[]){ 
        //using legacy classes
        Date date = new Date();
        Date d1 = new Date(69,6,9);
        System.out.println("Current date is: " + date + "\n" + d1);
        int month = date.getMonth();
        int year = date.getYear();
        System.out.println("Current month is: " + month);
        System.out.println("Current year is: " + year);
    }
}
