package org.example.leetcode;


public class CanPlaceFlowersProblem {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 ){
                 if (i>0 && i < flowerbed.length-1){
                     if (flowerbed[i+1] == 0 && flowerbed[i-1] == 0 ){
                         flowerbed[i] = 1 ;
                         n --;
                     }
                 }
                 if(i == 0 ){
                     if (flowerbed.length == 1||flowerbed[i+1] == 0  ){
                         flowerbed[i] = 1 ;
                         n --;
                     }
                 }
                 if (i == flowerbed.length-1){
                     if ( flowerbed.length==1  ||flowerbed[i-1] == 0){
                         flowerbed[i] = 1 ;
                         n --;
                     }
                 }
            }
        }
        return (n <= 0);
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,1,0,1 ,1}; int n = 1 ;
        CanPlaceFlowersProblem canPlaceFlowersProblem = new CanPlaceFlowersProblem() ;
        boolean test = canPlaceFlowersProblem.canPlaceFlowers(flowerbed , n);
        System.out.println(test);
    }
}
