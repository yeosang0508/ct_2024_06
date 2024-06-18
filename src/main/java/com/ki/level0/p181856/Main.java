package com.ki.level0.p181856;

public class Main {
}
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length < arr2.length){
            return -1;
        } else if(arr1.length > arr2.length){
            return 1;
        }

        int total1 = 0;
        int total2 = 0;

        for(int i = 0; i < arr1.length; i++){
            total1 += arr1[i];
            total2 += arr2[i];
        }


        if(arr1.length == arr2.length){
            if(total1 > total2){
                return 1;
            }else if(total1 < total2){
                return -1;
            }
        }
        return 0;
    }
}