package string_problems;

import java.util.Scanner;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        String reverse="";
        System.out.println("Please input String: ");
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("the given string is a palindrome");
        }else{
            System.out.println("The given string is not a palindrome");
        }

    }

    // Implement here

}
