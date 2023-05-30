package math_problems;

import java.util.ArrayList;
import java.util.List;
public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        List<Integer>primeNumber=new ArrayList<>();
        for (int numToCheck=2;numToCheck<=1000000;numToCheck++){
            boolean isPrime = true;
            for(int factor=2;factor<=numToCheck;factor++){
                if(numToCheck%factor==0){
                   isPrime=false;{
                    break;
                }
            }
            if (isPrime){
            primeNumber.add(numToCheck) ;
            }
            }
            System.out.println("prime numbers from 1 to 1 000 000 are:\n");
        for(int number:primeNumber){
            System.out.println(number);
        }
        }


    }

}
