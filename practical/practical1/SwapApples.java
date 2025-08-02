import java.util.*;
public class SwapApples {
    public static void main(String[] a) {
        int j = 5, t = 3;
        System.out.println("Before Swap: Jerry: " + j + ", Tom: " + t);
        int temp = j; j = t; t = temp;
        System.out.println("After Swap: Jerry: " + j + ", Tom: " + t);
    }
}