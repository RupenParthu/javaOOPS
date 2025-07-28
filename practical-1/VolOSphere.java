import java.util.*;
public class VolOSphere{
    public static void main(String[] args){
        //find the volume of the sphere
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        float radius = sc.nextFloat();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The given radius of the sphere is " + (int)radius + " and the volume of the sphere is " + (int)volume);

    }
}