package skill.skill4;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class DispAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the user birthdate (yyyy-MM-dd): ");
        String dob = sc.nextLine(); 
        LocalDate dateob = LocalDate.parse(dob);
        LocalDate current = LocalDate.now();
        Period age = Period.between(dateob, current);
        System.out.println("The age is: " + age.getYears() + " years, " +
                   age.getMonths() + " months, and " +
                   age.getDays() + " days.");
        sc.close();
    }
}
