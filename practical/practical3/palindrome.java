package practical.practical3;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        StringBuilder st = new StringBuilder(str);
        String rev = st.reverse().toString();
        System.out.println("This is the reversed string: " + rev);

        

        if(str.equals(rev)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");

        }
    }
}
