package org.example.leetcode;

public class GreatestCommonDivisorOfStrings {

    public boolean isValid (String w1 , String w2 , int k ){
        int len1 = w1.length() ,  len2 = w2.length() ;
        if (len1%k > 0 || len2%k>0){
            return false;
        }
        else {
            String base = w1.substring(0 , k) ;
            return w1.replace(base ,"").isEmpty() &&
                    w2.replace(base ,"").isEmpty() ;
        }
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length() ,  len2 = str2.length() ;
        for (int i = Math.min(len1 , len2) ; i >= 1 ; --i) {
            if (isValid(str1 , str2 , i)){
                return str1.substring(0 , i);
            }
        }
        return ""  ;
    }

    public static void main(String[] args) {
        String w = "adaadaada" , w1 = "ada" ;
        GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();
        boolean x =  greatestCommonDivisorOfStrings.isValid(w , w1 , 3) ;
        String test = greatestCommonDivisorOfStrings.gcdOfStrings(w , w1) ;
        System.out.println(test);
    }
}
