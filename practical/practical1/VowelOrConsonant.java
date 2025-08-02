import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        System.out.println("AEIOUaeiou".indexOf(c) != -1 ? "Vowel" : "Consonant");
    }
}