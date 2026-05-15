package org.example.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    //Input: nums = [1,2,3,4]
    //Output:       [24,12,8,6]
    static {
        for(int i=0; i<500; i++){
            productExceptSelf(new int[2]);
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int leftProduct = 1;
        //Produkte links von i speichern
        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;

        //Produkte rechts von i dazu multiplizieren
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] test = {1,0,2,2} ;
        int[] res = productExceptSelf(test) ;
        System.out.println(Arrays.toString(res));
    }
}
