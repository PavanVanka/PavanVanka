package module1.Day1;

import java.util.*;

public class LongestSubString
{

    public static  String longestSubString(List<String> words) {
        String longestSubString = "";
        Map<Integer,String> subStrings = new HashMap<>();
        int longestStringSize = 0;
        String tempString = "";
        for (String word : words) {
            Set<Character> uniqueChars = new HashSet<>();
            int charIndex = 0;
            for(int i = 0 ; i < word.length() ; i ++) {
                if (uniqueChars.add(word.charAt(i))){
                    tempString = tempString.concat(String.valueOf(word.charAt(i)));

                } else {
                    if (longestStringSize < tempString.length()) {
                        longestSubString = tempString;
                        subStrings.put(longestSubString.length(), longestSubString);
                        longestStringSize = longestSubString.length();

                    }
                    tempString = "";
                    i = ++charIndex -1;
                    uniqueChars = new HashSet<>();

                }
            }
            if (tempString.length() > longestSubString.length()) {
                longestSubString = tempString;
            }
            return longestSubString;
        }
        return longestSubString;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("anianhblend");
        System.out.println(longestSubString(strings));
    }
}
