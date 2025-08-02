package practical.practical2;

import java.util.*;

public class equalto {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first string: ");
         String a = sc.nextLine();
         System.out.print("Enter the second string: ");
         String b = sc.nextLine();
         //even when entered the same string the == doesn't work 
         if(a==b){
            System.out.println("Used '==' and yes string is same");
         }
         if(a.equals(b)){
            System.out.println("Used 'equals()' and yes string is same");
         }
    }
}
