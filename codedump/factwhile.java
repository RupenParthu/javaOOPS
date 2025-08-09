package codedump;
import java.util.Scanner;

public class factwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int i = 1, fact = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("factorial is: " + fact);
    }
}