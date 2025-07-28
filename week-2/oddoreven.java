import java.util.*;
public class oddoreven {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any number to find out whether it is odd or even: ");
          int num = sc.nextInt();
          if(num%2==0){
            System.out.println("The Number is Even");
          }else{
             System.out.println("The Number is Odd");
          }
    }
}
