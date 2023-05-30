package math_problems;

import java.util.Scanner;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */


    //Factorial By recursion
public static int Factorial(int n){
    if(n==1){
    return 1;
    }else{
        return n * Factorial(n-1);
    }
}
    public static void main(String[] args) {
    //Factorial by iterating:
    int i,fact=1;
    Scanner scr=new Scanner(System.in);
        System.out.println("enter number you want to calculate");
        int number= scr.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
    //int number=7;
   // fact=Factorial(number);
        System.out.println("Factorial by recursion of "+number+" is "+fact);
    }

}
