package skill.skill4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class datentim {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the desiered date format (e.g.,dd/MM/yyyy HH:mm:ss or MM-dd-yyyy hh:mm a): ");
        String choice = sc.nextLine();

        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern(choice);
        String formatted = current.format(format);
        
        System.out.println("Formatted date is: " + formatted);
    }
    
}
