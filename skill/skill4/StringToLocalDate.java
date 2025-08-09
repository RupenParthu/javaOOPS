package skill.skill4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class StringToLocalDate {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        DayOfWeek dayOfWeek = date.getDayOfWeek();  
        System.out.println("Day of the week is: " + dayOfWeek);
    }
}
