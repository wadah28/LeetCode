package org.example.leetcode;

import java.util.*;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        LinkedHashMap<Integer,Character> vowelInSting = new LinkedHashMap<>( );
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder sb  = new StringBuilder(s) ;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))){
                vowelInSting.put(i , s.charAt(i));
            }
        }

        List<Integer> postions = new ArrayList<>(vowelInSting.keySet());
        List<Character> chars = new ArrayList<>(vowelInSting.values());
        Collections.reverse(chars);
        for (int j = 0; j < postions.size(); j++) {
            sb.setCharAt(postions.get(j) , chars.get(j));
        }


        return sb.toString() ;
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString() ;
        String result  = reverseVowelsOfAString.reverseVowels("wadideh");
        System.out.println(result);

    }
}
