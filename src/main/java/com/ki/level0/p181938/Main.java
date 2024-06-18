package com.ki.level0.p181938;

public class Main {
}

class Solution {
    public int solution(int a, int b) {
        String ab = a + "" + b;

        int abValue = Integer.parseInt(ab);

        if (abValue > (2 * a * b)) {
            return abValue;
        }
        return (2 * a * b);
    }
}