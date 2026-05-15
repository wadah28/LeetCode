package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
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
        String x = "    hello world      ";
        String y  = "hello world";
        String neu = reverseWordsInAString.reverseWords(x);
        System.out.println(neu);
        //System.out.println(y);
    }
}
