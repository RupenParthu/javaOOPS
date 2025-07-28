import java.util.*;
public class Avg3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers to get the avg: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int result = (a+b+c)/3;

        System.out.println("The Avg of the Numbers " + a + " " + b + " " + c + " is " + result);

    }
}