package com.ki.level0.p181939;

public class Main {

}

class Solution {
    public int solution(int a, int b) {
        String ab = a + "" + b;
        String ba = b + "" + a;

        int abValue = Integer.parseInt(ab);
        int baValue = Integer.parseInt(ba);


        if(abValue >= baValue){
            return abValue;
        }else {
            return baValue;
        }
    }
}