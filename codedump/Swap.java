package codedump;
import java.util.*;

public class Swap{
      public static void main(String args[]){
           //2.Program to swap 2 numbers print the before and after numbers
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the 2  integers to swap them: ");
           int a = sc.nextInt();
           int b = sc.nextInt();
           int real_a = a,real_b = b;
           a = a+b;
           b = a-b;
           a = a-b;
           System.out.println("After swapping the digits " + real_a +" and " + real_b + " ,We get " + a + " and " + b);
    }
}