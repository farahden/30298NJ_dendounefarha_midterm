package string_problems;

import java.util.*;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

   /* public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
       countandWords(String s);
        FindDuplicateWords(String string);

        }
    public static void FindDuplicateWords(String string ){
        int count;
        string=string.toLowerCase();
        String[] words=string.replace(",","").split(" ");
        System.out.println("Duplicated words are: ");
        int wordLengthCounter=0;
        int duplicateWordCount=0;
        for(int i=0;i<words.length;i++) {
            count = 1;
            int j;
            for (j = i + 1; i < words.length; j++) {
                count++;
                words[j] = "0";
            }


            if (count >= 1 && words[j] != "0") {
                System.out.println("word " + words[i] + ",occurrences: ");
                wordLengthCounter += words[i].length();
                duplicateWordCount++;
            }
        }
           /* public static void countandWords (String string){
                List<String> output = new ArrayList<>();
                List<Integer> count = new ArrayList<>();
                findWords(s, output, count);
                System.out.println(output);
                System.out.println(count);
            }
            public static void findWords (String s, List < String > output, List < Integer > count){
                String[] words = s.split(" ", -2);
                Map<String, Integer> map = new LinkedHashMap<>();
                Arrays.stream(words).forEach(e -> map.put(e, map.getOrDefault(e, 0) + 1));
                map.forEach((k, v) -> {
                    output.add(k);
                    count.add(v);
                });

            }
*/
        }
