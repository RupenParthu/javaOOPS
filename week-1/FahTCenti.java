import java.util.*;

public class FahTCenti{
      public static void main(String args[]){
           //1.Program to convert Fahrenheit to Centigrade
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Fahrenheit to Convet to Centigrade");
           float F = sc.nextFloat();
           float C = (F-32)*5f/9;
           System.out.println("The given Fahrenheit converted to centigrade is " + C);
    }
}