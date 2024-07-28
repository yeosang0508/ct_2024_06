package com.ki.level0.p120844;

public class Main {
}
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int num = 0;

        if(direction.equals("right")) {
            num = numbers[numbers.length-1];

            int a = numbers.length - 1;
            for(int i = numbers.length-2 ; i>= 0; i--) {
                numbers[a--] = numbers[i];
            }
            numbers[0] = num;

            return numbers;
        } else{
            num = numbers[0];

            for(int i = 1; i<numbers.length; i++) {
                numbers[i-1] = numbers[i];
            }
            numbers[numbers.length-1] = num;
        }
        return numbers;
    }
}