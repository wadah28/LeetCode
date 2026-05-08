package org.example.leetcode;


import java.util.Arrays;
import java.util.HashMap;

class TwoSumProblem {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if( nums[i] + nums[j] == target){
                    return new int[]{i , j};
                }

            }
        }
            return null ;
    }


    public int[] twoSum2 ( int[] nums , int target) {
        HashMap<Integer , Integer > hashMap = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int complement = target - nums[i]  ;
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement) , i };
            }
            hashMap.put(nums[i], i );

        }
        return null ;
    }


    public static void main(String[] args) {
        TwoSumProblem solution = new TwoSumProblem() ;
        int[] array = {100 , 16 , 2, 7, 12, 15} ; int target = 9 ;
        int[] array1 = {3 , 2 , 4} ; int target1 = 6 ;
        int[] array2 = {3 , 3} ; int target2 = 6 ;

        int[] x = solution.twoSum2(array,target);
        System.out.println(Arrays.toString(x));
    }
}