package string_problems;

import java.util.*;

public class DetermineLargestWord {

    /** INSTRUCTIONS
     * Implement a solution to find the length of the longest word in the given sentence below
     * Your solution should return a map containing the length of the word as the key & the word itself as the value
     * "10: biological"
     */

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);



    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        // Implement here
        Map allwords =countandWords(wordGiven);
        Object[] objectArray = allwords.entrySet().toArray();
        for (Object entry : map.entrySet()) {
            String largerst = Arrays.toString(objectArray);
            System.out.println(Arrays.toString(objectArray) + " here");

        } return map;
    }
        public static Map countandWords(String s){
            List<String> output = new ArrayList<>();
            List<Integer> count = new ArrayList<>();
            findduplicateWords(s, output, count);
            System.out.println(output);
            System.out.println(count);
            return null;
        }
        public static void findduplicateWords(String s, List<String> output, List<Integer> count) {
            String[] words = s.split(" ", -2);
            Map<String, Integer> map = new LinkedHashMap();
            Arrays.stream(words).forEach(e -> map.put(e, map.getOrDefault(e, 0) + 1));
            map.forEach((k, v) -> {
                ;
                output.add(k);
                count.add(v);
            });
            System.out.println(findTheLargestWord(s));
            Map returntype = findTheLargestWord(s);
}
}
