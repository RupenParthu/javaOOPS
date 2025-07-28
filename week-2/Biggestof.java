import java.util.*;
public class Biggestof{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find the greatest among them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Greatest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Greatest number is: " + b);
        } else {
            System.out.println("Greatest number is: " + c);
        }

    }
}
