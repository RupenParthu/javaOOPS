import java.util.*;
public class dataNarrow {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an double data type number: ");
        double i = sc.nextFloat();
        int j = (int)i;
        System.out.print("double is: " + i + "\nint is: " + j);
    }
}
