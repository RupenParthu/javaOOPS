package practical.practical2;
import java.util.*;

public class stroutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: "); // Write Hello World
        String str = sc.nextLine();
        System.out.println(str);
        char a = str.charAt(0);
        int b = str.length();
        String toupper = str.toUpperCase();
        String tolower = str.toLowerCase();
        String sub = str.substring(6); 
        Boolean contain = str.contains("Hello");
        String replace = str.replace("World","Sekai");

        System.out.println("First character: " + a);
        System.out.println("Length: " + b);
        System.out.println("Uppercase: " + toupper);
        System.out.println("Lowercase: " + tolower);
        System.out.println("Substring from index 6: " + sub);
        System.out.println("Contains 'Hello': " + contain);
        System.out.println("Replaced 'World' with 'Sekai': " + replace);
    }
}
