package com.ki.level0.p120814;

public class Main {
}

class Solution {
    public int solution(int n) {
        int a = 0;
        int i = n % 7;

        if (n / 7 < 1) {
            return 1;
        } else if (i == 0) {
            a = (n / 7);
            return a;
        } else if (n > 7) {
            a = (n / 7) + 1;

        }
        return a;
    }
}