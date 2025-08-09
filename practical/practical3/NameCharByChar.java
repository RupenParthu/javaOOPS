package practical.practical3;
import java.util.*;

public class NameCharByChar {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
