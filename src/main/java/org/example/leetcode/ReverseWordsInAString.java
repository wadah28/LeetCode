package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class ReverseWordsInAString {


    static {for (int i = 0; i < 100; i++) {reverseWords("");}}


    public static String reverseWords(String s) {
        String stToworkWith = s.trim();
        String[] strings = stToworkWith.split("\\s");
        List<String> words = new ArrayList<>() ;
        // StringBuilder sb = new StringBuilder();
        for (String c : strings){
            if (!c.isEmpty()){
                words.add(c);
            }
        }
        //String test  = sb.toString();
        //char[] testcharlist =  test.toCharArray();

        // String result = String.join(" " , );
        Collections.reverse(words);

    return String.join(" " , words) ;
    }

    public static String reverseWords1(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;

        int index = length - 1;

        char[] result = new char[length];
        int resultIndex = 0;

        while (index >= 0) {

            // Skip trailing/multiple spaces
            while (index >= 0 && chars[index] == ' ') {
                index--;
            }

            if (index < 0) {
                break;
            }

            int wordEnd = index;

            // Find the beginning of the word
            while (index >= 0 && chars[index] != ' ') {
                index--;
            }

            int wordStart = index + 1;

            // Add space before next word
            if (resultIndex != 0) {
                result[resultIndex++] = ' ';
            }

            // Copy word into result
            for (int i = wordStart; i <= wordEnd; i++) {
                result[resultIndex++] = chars[i];
            }
        }

        return new String(result, 0, resultIndex);
    }

    public List<Integer> findPostionWhiteSpaces(String s){
        ArrayList<Integer> postions = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='\t' || s.charAt(i) == ' ' || s.charAt(i) == '\0'){
                postions.add(i);
            }
        }
        return postions ;
    }


    public static void main(String[] args) {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString() ;
        String x = "   world Hallo   ";
        String y  = "hello world";
        String neu = reverseWords1(x);
        System.out.println(neu);
        //System.out.println(y);
    }
}
