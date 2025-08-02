package practical.practical2;
import java.util.Scanner;

public class minmaxarr {
    // develop a java prog display max and min value in a given array
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter the element in the " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("The Min is: " + min + " and the Max is: "+ max);
    }

}
