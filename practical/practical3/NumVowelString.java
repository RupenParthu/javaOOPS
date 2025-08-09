package practical.practical3;

import java.util.Scanner;

public class NumVowelString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the String to count the no of vowels: ");
        String str = sc.nextLine();
        String vowel = "aeiouAEIOU";
        int cnt = 0;
        for(char c : str.toCharArray()){
            if(vowel.indexOf(c)!=-1){
                cnt++;
            }
        }
        System.out.println("The num of vowels in the given string is: " + cnt);
    }
}
