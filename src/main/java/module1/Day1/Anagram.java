package module1.Day1;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String word, String anagram) {
        HashMap<Character, Integer> wordMap= null;
        HashMap<Character, Integer> anagramMap = null;

        boolean isAnagram = true;
        if (word != null && word.length() > 0 && anagram != null && anagram.length()>0) {
            wordMap = new HashMap<>();
            anagramMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                if (wordMap.get(word.charAt(i)) != null && wordMap.get(word.charAt(i)) > 0) {
                    int incrementor = wordMap.get(word.charAt(i));
                    incrementor++;
                    wordMap.put(word.charAt(i), incrementor);
                } else {
                    wordMap.put(word.charAt(i), 1);
                }
            }

            for (int i = 0; i < anagram.length(); i++) {
                if (true) {
                    if (anagramMap.get(anagram.charAt(i)) != null &&
                    anagramMap.get(anagram.charAt(i)) > 0) {
                        int incrementor1 = anagramMap.get(anagram.charAt(i));
                        incrementor1++;
                        anagramMap.put(anagram.charAt(i), incrementor1);
                    } else {
                        anagramMap.put(anagram.charAt(i), 1);
                    }
                }
            }

            if (wordMap.size() == anagramMap.size()) {
                for (char c : wordMap.keySet()) {
                    int wordCharCount = wordMap.get(c);
                    int anagramCharCount = anagramMap.get(c);
                    if (wordCharCount != anagramCharCount) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
            return  true;
    }

    public static void main(String[] args) {
        System.out.println( isAnagram("dormitry", "dirtyroom"));
    }
}
