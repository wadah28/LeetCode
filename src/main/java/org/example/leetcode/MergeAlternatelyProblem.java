package org.example.leetcode;

public class MergeAlternatelyProblem {

    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int i=0 , j = 0 ;
        StringBuilder merged = new StringBuilder();
        while (i < len1 || j < len2){
            if (i < len1){
                merged.append(word1.charAt(i));
                i++;
            }
            if (j< len2){
                merged.append(word2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }

    public static void main(String[] args) {
        String word = "abc" ;
        String was = "def " ;
        MergeAlternatelyProblem mergeAlternatelyProblem = new MergeAlternatelyProblem();
        String result = mergeAlternatelyProblem.mergeAlternately(word , was);
        System.out.println(result);
    }
}
