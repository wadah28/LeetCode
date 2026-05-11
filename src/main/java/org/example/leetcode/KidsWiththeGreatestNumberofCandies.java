package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt() ;

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max){
                arr.add(i, true);
            }
            else {
                arr.add(i , false);
            }
        }
        return arr ;
    }

    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        // Find out the greatest number of candies among all the kids.
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }
        // For each kid, check if they will have greatest number of candies
        // among all the kids.
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {

       int[] candies = {2,3,5,1,3}; int extraCandies = 3;
       int[] candies1 = {4,2,1,1,2}; int extraCandies1 = 1;
        KidsWiththeGreatestNumberofCandies kidsWiththeGreatestNumberofCandies = new KidsWiththeGreatestNumberofCandies();
        ArrayList<Boolean> result = (ArrayList<Boolean>) kidsWiththeGreatestNumberofCandies.kidsWithCandies(candies , extraCandies);
        ArrayList<Boolean> result1 = (ArrayList<Boolean>) kidsWiththeGreatestNumberofCandies.kidsWithCandies(candies1 , extraCandies1);

        System.out.println(result1);
    }
}
