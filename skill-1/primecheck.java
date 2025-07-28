import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();
        boolean isprime = true;

        if (n <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        if (isprime)
            System.out.println("prime");
        else
            System.out.println("not a prime");

        sc.close();
    }
}
