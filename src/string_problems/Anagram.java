package string_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {
        String S1 ;
        String S2;
        System.out.println("please enter the first word");
        Scanner sc1=new Scanner(System.in);
        S1= sc1.next();
        System.out.println("please enter 2nd word");
        Scanner sc2=new Scanner(System.in);
        S2= sc2.next();
        if(anagramCheck(S1,S2)){
            System.out.println("are: Anagrams");
        }else{
            System.out.println("are not Anagrams");
        }
    }
    static boolean anagramCheck(String S1, String S2) {
        if (S1.length() != S2.length()) {
            return false;
        }
        char string1ToArray[]=S1.toCharArray();
        char string2ToArray[]=S2.toCharArray();

        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);
        for(int i=0;i<S1.length();i++){
            if(string1ToArray[i]!=string2ToArray[i]){
                return false;
            }
        }return true;

    }

}
