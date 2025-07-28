import java.util.*;
public class SqrtSeries {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println("√" + i + ": " + Math.sqrt(i));
    }
}