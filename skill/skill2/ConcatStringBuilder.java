package skill.skill2;

import java.util.Scanner;

public class ConcatStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        System.out.print("Enter first string: ");
        sb1.append(sc.nextLine());

        System.out.print("Enter second string: ");
        sb2.append(sc.nextLine());

        sb1.append(sb2);

        System.out.println("After Appending: " + sb1);
    }
}
