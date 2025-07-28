import java.util.*;
public class AlphabetOrNot {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        System.out.println((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ? "Alphabet" : "Not Alphabet");
    }
}