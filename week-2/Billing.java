import java.util.*;
public class Billing {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        double amt = s.nextDouble();
        double gst = amt * 0.18, maint = amt * 0.02;
        double disc = amt > 1000 ? amt * 0.1 : amt * 0.05;
        double total = amt + gst + maint - disc;
        System.out.println("Amt: " + amt);
        System.out.println("GST: " + gst);
        System.out.println("Maint: " + maint);
        System.out.println("Disc: " + disc);
        System.out.println("Total: " + total);
    }
}